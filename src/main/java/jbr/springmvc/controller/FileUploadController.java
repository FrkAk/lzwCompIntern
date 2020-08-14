package jbr.springmvc.controller;

import java.io.*;
import java.nio.Buffer;
import java.util.List;
import java.util.UUID;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;


import jbr.springmvc.model.User;
import jbr.springmvc.service.LZWCompressionService;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Handles requests for the application file upload requests
 */
@Controller
public class FileUploadController {

    private static final Logger logger = LoggerFactory
            .getLogger(FileUploadController.class);



    @RequestMapping(value = "/upload", method = RequestMethod.GET)
    public ModelAndView showUpload(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView mav = new ModelAndView("upload");
        return mav;
    }


    /**
     * Upload single file using Spring Controller
     */
    @RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
    public @ResponseBody
    String uploadFileAndLZWHandler(@RequestParam("file") MultipartFile file,
                                   @RequestParam("user") User user) {
        String uniqueID = UUID.randomUUID().toString();
        String fileLogName= uniqueID+"."+getFileExtension(file);

        System.out.println(user);



        if (!file.isEmpty()) {
            try {




                byte[] uncompressedByte = file.getBytes();
                String fileContent= new String(uncompressedByte);

                List<Integer> compressed = LZWCompressionService.compress(fileContent);
                //System.out.println(compressed);


                byte[] compressedByte= convertIntegersToBytes(compressed);
                writeFile(compressedByte,"compressed"+fileLogName);


                String decompressed = LZWCompressionService.decompress(compressed);
                //System.out.println(decompressed);

                writeFile(uncompressedByte,"uncompressedByte"+fileLogName);


                return "You successfully uploaded file=" + fileLogName;
            } catch (Exception e) {
                return "You failed to upload " + fileLogName + " => " + e.getMessage();
            }
        } else {
            return "You failed to upload " + fileLogName
                    + " because the file was empty.";
        }
    }


    public static void writeFile(byte[] fileBytes, String fileLogName) throws IOException {
        // Creating the directory to store file
        String rootPath = System.getProperty("catalina.home");
        File dir = new File(rootPath + File.separator + "tmpFiles");
        if (!dir.exists())
            dir.mkdirs();


        // Create the file on server
        File serverFile = new File(dir.getAbsolutePath()
                + File.separator + fileLogName);
        BufferedOutputStream stream = new BufferedOutputStream(
                new FileOutputStream(serverFile));
        stream.write(fileBytes);
        stream.close();

        logger.info("Server File Location="
                + serverFile.getAbsolutePath());
    }

    public static byte[] convertIntegersToBytes (List<Integer> integers) {
        if (integers != null) {
            byte[] outputBytes = new byte[integers.size()*4
                    ];

            for(int i = 0, k = 0; i < integers.size(); i++) {
                int integerTemp = integers.get(i);
                for(int j = 0; j < 4; j++, k++) {
                    outputBytes[k] = (byte)((integerTemp >> (8 * j)) & 0xFF);
                }
            }
            return outputBytes;
        } else {
            return null;
        }
    }

    private static String getFileExtension(MultipartFile file) {
        String fileName = file.getOriginalFilename();
        if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
            return fileName.substring(fileName.lastIndexOf(".")+1);
        else return "";
    }


}

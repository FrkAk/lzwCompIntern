package jbr.springmvc.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import java.util.UUID;

import jbr.springmvc.service.FileService;
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
    String uploadFileAndLZWHandler(@RequestParam("file") MultipartFile file) {
        String uniqueID = UUID.randomUUID().toString();
        String fileLogName= uniqueID+".txt";


        if (!file.isEmpty()) {
            try {

                FileService fileService = new FileService();
                fileService.setFile(file);
                fileService.setName(uniqueID);
                fileService.setSize(file.getSize());
                fileService.setExtension(file.getName());
                fileService.setUser(null);


                File zip= File.createTempFile(uniqueID,"temp");
                FileOutputStream outputStream= new FileOutputStream(zip);
                IOUtils.copy(file.getInputStream(),outputStream);

                /**
                 * NOT COMPLETED!!!!!
                 */


                byte[] bytes = file.getBytes();
                String fileContent= new String(bytes);

                List<Integer> compressed = LZWCompressionService.compress(fileContent);
                System.out.println(compressed);
                /**
                 * Compressed content should be written to to file.
                 */

                String decompressed = LZWCompressionService.decompress(compressed);
                System.out.println(decompressed);


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
                stream.write(bytes);
                stream.close();

                logger.info("Server File Location="
                        + serverFile.getAbsolutePath());

                return "You successfully uploaded file=" + fileLogName;
            } catch (Exception e) {
                return "You failed to upload " + fileLogName + " => " + e.getMessage();
            }
        } else {
            return "You failed to upload " + fileLogName
                    + " because the file was empty.";
        }
    }

}

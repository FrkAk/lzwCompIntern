package jbr.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jbr.springmvc.model.FileStorage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.FileNotFoundException;

@Controller
public class FileController {


    @RequestMapping(value = "/uploadFile", method = RequestMethod.GET)
    public ModelAndView uploadFile(HttpServletRequest request, HttpServletResponse response){
        ModelAndView mav = new ModelAndView("uploadFile");
        mav.addObject("dropzone", new FileStorage());
        System.out.println("File has been arrived uploadFile");

        return mav;
    }

    @RequestMapping(value = "/uploadFileProcess", method = RequestMethod.POST)
    public ModelAndView uploadFileProcess (HttpServletRequest request, HttpServletResponse response,
                                           @ModelAttribute("dropzone") FileStorage fileStorage){
        ModelAndView mav = null;
        System.out.println("File has been arrived uploadFileProcess");
        File uploadedFile= fileStorage.getFile();
        try {
            fileStorage.setFile(uploadedFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.printf("Hello");


        return mav;
    }



}

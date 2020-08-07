package jbr.springmvc.service;


import com.google.common.io.Files;
import jbr.springmvc.model.User;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FileService {

    private MultipartFile file;
    private String name;
    private String extension;
    private String path;
    private Long size;
    private User user;

    public MultipartFile getFile() {
        return file;
    }

    public String getName() {
        return name;
    }

    public String getExtension() {
        return getExtensionByGuava(this.name);
    }

    public String getPath() {
        return path;
    }

    public Long getSize() {
        return size;
    }

    public User getUser() {
        return user;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExtension(String name) {
        this.extension = name;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public void setUser(User user) {
        this.user = user;
    }

    private String getExtensionByGuava(String filename) {
        return Files.getFileExtension(filename);
    }




}
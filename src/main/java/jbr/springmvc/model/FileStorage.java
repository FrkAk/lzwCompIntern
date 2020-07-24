package jbr.springmvc.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileStorage {

    private File file;
    private String data;

    public File getFile() {
        return file;
    }

    public String getData() {
        return data;
    }


    public void setFile(File file) throws FileNotFoundException {
        this.file = file;
        setData();
    }

    public void setData() throws FileNotFoundException {
        this.data = "";
        Scanner myReader = new Scanner(this.file);
        while (myReader.hasNextLine()) {
            this.data += myReader.nextLine();
            System.out.println(data);
        }
    }
}

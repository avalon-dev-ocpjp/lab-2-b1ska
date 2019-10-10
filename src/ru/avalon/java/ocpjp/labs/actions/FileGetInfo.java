package ru.avalon.java.ocpjp.labs.actions;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class FileGetInfo implements Action {

    String filename = "D:\\dd\\resources\\fff.txt";
    File file = new File(filename);
    Path p1 = file.toPath();

    public void getInfo() throws IOException {

        BasicFileAttributes attr = Files.readAttributes(p1, BasicFileAttributes.class);

        System.out.println("creationTime: " + attr.creationTime());
        System.out.println("lastAccessTime: " + attr.lastAccessTime());
        System.out.println("lastModifiedTime: " + attr.lastModifiedTime());
        System.out.println("isDirectory: " + attr.isDirectory());
        System.out.println("isOther: " + attr.isOther());
        System.out.println("isRegularFile: " + attr.isRegularFile());
        System.out.println("isSymbolicLink: " + attr.isSymbolicLink());
        System.out.println("size: " + attr.size());

    }

    @Override
    public void run() {
        try {
            getInfo();
        } catch (IOException ex) {
            System.out.println("Cant get attributes, file not found");
        }
    }

    @Override
    public void close() throws Exception {
         //To change body of generated methods, choose Tools | Templates.
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.ocpjp.labs.actions;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileRenameAction implements Action {

    /**
     * Действие, которое переименовывает файлы.
     */
    String filename = "D:\\dd\\resources\\fff.txt";
    String dest = "D:\\dd\\resources\\fff2.txt";
    File source = new File(filename);
    Path p1 = source.toPath();

    File destination = new File(dest);
    Path p2 = destination.toPath();

    private void renamefile() throws IOException {
        if(!source.exists()){
            System.out.println("File not found");
        }else{
        if (!destination.exists()) {
            source.renameTo(destination);
            if (!source.exists()) {
                System.out.println("File renamed");

            }
        } else {
            source.delete();
            System.out.println("File renamed");
        }

    }
    }

    
      


@Override
        public void run() {
        try {

            renamefile();
        } catch (IOException ex) {
            System.out.println("Problems with rename the file");
        }
    }

    @Override
        public void close() throws Exception {
         source = null;
    }
}

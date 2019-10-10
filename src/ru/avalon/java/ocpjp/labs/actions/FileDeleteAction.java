/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.ocpjp.labs.actions;

import java.io.File;

/**
 *
 * @author JAVA
 */
public class FileDeleteAction implements Action{

    String file = "fff.txt";
    String path = "D:\\dd\\resources";
    File f = new File(path, file);
    public void delete(){
        
        ;
        if(f.isFile()){
        boolean deleted = f.delete();
        if(deleted)
            System.out.println("File deleted");
        } else {
            System.out.println("File not found");
        }
    }
    
    @Override
    public void run() {
        delete();
        
      
    }

    @Override
    public void close() throws Exception {
      f = null;
    }
    
}

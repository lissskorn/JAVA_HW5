/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hw5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author olesiyakorgueva
 */
public class FileUtils {
       
    private String dir;
    private String ext;
     
    public FileUtils(String dir, String ext) {
        this.dir = dir;
        this.ext = ext;
    }
     
    public String getDir() {
        return dir;
    }
    public void setDir(String dir) {
        this.dir = dir;
    }
     
    public String getExt() {
        return ext;
    }
    public void setExt(String ext) {
        this.ext = ext;
    }  
}



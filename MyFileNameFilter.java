/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hw5;

import java.io.File;
import java.io.FilenameFilter;

/**
 *
 * @author olesiyakorgueva
 */
public class MyFileNameFilter implements FilenameFilter {

    private String ext;
         
    public MyFileNameFilter(String ext){
        this.ext = ext.toLowerCase();
  }
        @Override
        public boolean accept(File dir, String name) {
            return name.toLowerCase().endsWith(ext);
        }
}
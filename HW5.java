/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hw5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author olesiyakorgueva
 */
public class HW5 {

   

    public static void main(String[] args) throws IOException {
        System.out.println("Вариант 4; РИБО-04-21; Коргуева Олеся");
       
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter path: ");
        String dir = myObj.nextLine();
        System.out.println("Enter dirName: ");
        String ext = myObj.nextLine();
        findFiles(dir, ext); 
    }
    
    
    private static void findFiles(String dir, String ext) {
        File file = new File(dir);
        if(!file.exists()) System.out.println(dir + " File does not contain");
        File[] listFiles = file.listFiles(new MyFileNameFilter(ext));
        if(listFiles.length == 0){
            System.out.println(dir + " does not contain files with the extension " + ext);
        }else{
            for(File f : listFiles)
                System.out.println(dir + File.separator + f.getName());
        }
    }    
}




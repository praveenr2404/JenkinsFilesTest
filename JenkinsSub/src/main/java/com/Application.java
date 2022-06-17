package com;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Application {
    public static void main(String[] args) {

        String basePath = new File(System.getProperty("user.dir")).getAbsolutePath();
        if(!Files.exists(Paths.get(basePath+"/out/test.txt"))){
            basePath = new File(basePath).getParent();
        }

        System.out.println("Base Path: "+basePath);
        String filePath = basePath+"/out/test.txt";
        System.out.println("File Path: "+filePath);
        WriteFile.write(filePath);
        System.out.println("Write Success");
    }
}

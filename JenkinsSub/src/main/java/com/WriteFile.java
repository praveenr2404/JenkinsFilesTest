package com;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFile {
    public static void write(String filePath){
        try(FileWriter fWriter = new FileWriter(filePath,true);
            PrintWriter pWriter = new PrintWriter(fWriter)
        ){
            pWriter.println("abcd");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

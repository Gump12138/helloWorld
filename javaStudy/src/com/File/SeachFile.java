package com.File;

import java.io.File;

public class SeachFile {
    public static void main(String[] args) {
        File f=new File("C:\\Users\\G\\IdeaProjects\\java_study\\src\\com");
        printDir(f);
    }
    private static void printDir(File dir){
        File[] files=dir.listFiles();
        for (File file:files) {
            if (file.isFile()){
                if (file.getName().endsWith( ".java" )){
                    System.out.println(file.getAbsolutePath());
                }
            }else{
                printDir( file );
            }
        }
    }
}

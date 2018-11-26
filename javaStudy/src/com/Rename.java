package com;


import java.io.File;

public class Rename {
    public static void main(String[] args) {
        File dir=new File( "C:\\Users\\G\\Pictures\\Saved Pictures" );
        File[] dirlist=dir.listFiles();
        for (File a: dirlist) {
            String c=a.getAbsolutePath();
            StringBuilder d=new StringBuilder( c );
            if (!c.contains( "1-" )){
                Boolean b=a.renameTo( new File( d.insert( 35,"2-" ).toString()));
                System.out.println( a.getName()+"文件"+b );
           }
        }
    }
}

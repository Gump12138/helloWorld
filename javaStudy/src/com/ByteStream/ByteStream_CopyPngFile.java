package com.ByteStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream_CopyPngFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream=new FileInputStream( "C:\\Users\\G\\Pictures\\wallhalla-yzd1dzXTym.jpg" );
        FileOutputStream fileOutputStream=new FileOutputStream( "C:\\Users\\G\\Downloads\\JavaStudyCopyJpg.jpg" );
        byte[] rec=new byte[1024];
        int len;
        while((len=fileInputStream.read(rec))!=-1){
            fileOutputStream.write(rec,0,len );
        }
        fileOutputStream.close();
        fileInputStream.close();
    }
}

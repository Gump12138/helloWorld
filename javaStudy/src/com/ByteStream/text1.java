package com.ByteStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class text1 {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream=new FileOutputStream( "C:\\Users\\G\\a.txt" ,true);


            fileOutputStream.write( 99 );
            fileOutputStream.write( "\r\n".getBytes() );
            FileInputStream fileInputStream=new FileInputStream( "C:\\Users\\G\\a.txt" );
            byte[] b=new byte[2];
            int c=fileInputStream.read(b);
            System.out.println( new String( b ) );

            fileInputStream.close();
            fileOutputStream.close();
        }
        catch (IOException |NumberFormatException e){
            e.printStackTrace();
        }
    }
}

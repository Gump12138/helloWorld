package com.InputOutputStreamReaderWriter;

import java.io.*;

public class text {
    public static void main(String[] args) throws IOException {
            OutputStreamWriter outputStreamWriter=new OutputStreamWriter( new FileOutputStream( "a.txt" ),"gbk" );
            outputStreamWriter.write( "我爱Java" );
            InputStreamReader inputStreamReader=new InputStreamReader( new FileInputStream( "a.txt" ),"gbk" );

            char[] b=new char[1024];
            int len =0;
            while ((len=inputStreamReader.read( b ))!=-1){
                System.out.println( new String( b,0,len ) );
            }

            outputStreamWriter.close();
            inputStreamReader.close();

    }
}

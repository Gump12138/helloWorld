package com.BufferedStream;

import java.io.*;
import java.util.*;

public class FileSort {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader( new FileReader( "C:\\Users\\G\\IdeaProjects\\java_study\\src\\com\\BufferedStream\\a.txt" ) );
        BufferedWriter bufferedWriter=new BufferedWriter( new FileWriter( "C:\\Users\\G\\IdeaProjects\\java_study\\src\\com\\BufferedStream\\out.txt" ) );
        String line;
        String[] splite;
        HashMap<String,String> hashMap=new HashMap<>();
        while((line=bufferedReader.readLine())!=null){
            splite=line.split( "\\." );
            hashMap.put( splite[0],splite[1] );
        }
        Set<String> a =hashMap.keySet();
        bufferedReader.close();
        for (String key:a) {
            String value=hashMap.get( key );
            line=key+"."+value;
            bufferedWriter.write( line );
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}

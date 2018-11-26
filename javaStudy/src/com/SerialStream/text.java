package com.SerialStream;

import java.io.*;
import java.util.ArrayList;

public class text {
    public static void main(String[] args) {
        Student s1=new Student( 18,"司马懿" );
        Student s2=new Student( 18,"曹操" );
        Student s3=new Student( 18,"狗货" );
        ArrayList<Student> list=new ArrayList <>(  );
        try {
            ObjectOutputStream bis=new ObjectOutputStream( new FileOutputStream( "Student.txt" ) );
            list.add( s1 );
            list.add( s2 );
            list.add( s3 );
            bis.writeObject( list );
            bis.close();
            ObjectInputStream oos=new ObjectInputStream( new FileInputStream( "Student.txt" ) );
            ArrayList<Student> a=(ArrayList<Student>)oos.readObject();
            for (Student b: a) {
                System.out.println( b.name+b.age );
            }
            oos.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

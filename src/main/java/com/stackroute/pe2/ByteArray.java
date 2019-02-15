//Write a program to find all files of a folder and select only given extention fileName and
//        read content of this file using byte array

package com.stackroute.pe2;

import java.io.*;

public class ByteArray {

    public byte[] display()
    {

        File f;
        byte[] b;
        FileInputStream fin = null;
        try {
            f = new File("/home/mohammed/Downloads/TestCases/TestCase1/src/main/java/com/stackroute/pe2/bytearray");
        }
        catch (Exception e){
            System.out.println(e);
            return null;
        }

        try {
            fin = new FileInputStream(f);
            b = new byte[(int) f.length()];
            fin.read(b);
        }
        catch (Exception e){
            System.out.println(e);
            return null;
        }

        return b;

    }

}

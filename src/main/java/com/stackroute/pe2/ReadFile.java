//Write a program to read the content of a text file, convert the content in upper case
//        and print the same in console along with the length of the file.
 //THE LOCATION OF FILE IS IN THE SAME DIRECTORY
package com.stackroute.pe2;

import java.io.*;

public class ReadFile {

    public String displayFile() {
        //String filename = "/home/aman/Documents/Gopal/TestCase1/src/main/java/com/stackroute/pe2/file1.txt";


        File file = new File("/home/mohammed/Downloads/TestCases/TestCase1/src/main/java/com/stackroute/pe2/file1");

        byte[] b;
        FileInputStream fin = null;
        try {

        }
        catch (Exception e){
            System.out.println(e);
            return null;
        }
        try {
            fin = new FileInputStream(file);
            b = new byte[(int) file.length()];
            fin.read(b);
        }
        catch (Exception e){
            System.out.println(e);
            return null;
        }
        String str = new String(b);
        return str.toUpperCase();



    }
}

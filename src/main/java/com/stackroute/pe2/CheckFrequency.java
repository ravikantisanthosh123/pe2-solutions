package com.stackroute.pe2;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CheckFrequency {

    public int words()
    {
        int count=0;

        try
        {

            File file = new File("/home/mohammed/Downloads/TestCases/TestCase1/src/main/java/com/stackroute/pe2/frequencyfile");
            FileReader filereader = new FileReader(file);
            BufferedReader bufferreader = new BufferedReader(filereader);

            String line="";

            while((line = bufferreader.readLine()) != null)
            {

                String[] a = line.split("\\s+");

                count += a.length;


            }


        } catch(Exception e)
        {
            System.out.println("ERROR!!!");
        }

        return count;
    }

}
package com.stackroute.pe2;

public class MinMaxAvg {

    public  int [] dispMinMaxAvg(int [] marks, int arrayLength)
    {
        int[] res = new int[3];
        int min = marks[0];
        int max = marks[0];
        int avg =0;

        for (int x : marks){
            avg+= x;
            if (min > x){
                min = x;
            }
            if ( max < x){
                max = x;
            }
        }

        res[0] = avg/arrayLength;
        res[1] = min;
        res[2] = max;

        return res;
    }
}

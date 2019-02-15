
//Write a Java method to check if a given number is power of 4

package com.stackroute.pe2;

public class PowerOfFour {


    public boolean isPowerOfFour(int number)
    {

        for(int i = 1; i<= number ; i*=4)
        {
            if (i == number)
                return true;
        }


        return false;
    }


}

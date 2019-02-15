package com.stackroute.pe2;

public class Factorial {

    public int factorialOfNumberTill12(int input){

        int facto = 1;
        while (input > 0) {
            facto *= input;
            input--;
        }
        return facto;

    }
}

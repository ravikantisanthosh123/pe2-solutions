package com.stackroute.pe2;

/*this is the java class for test cases here in each function give logic
each method returns null by default
If it is not palindrome then return
if there is only "space" then return false
*/
public class Palindrome {

        public boolean isPalindrome(String input)
        {

            String out = "";

            for(int i = input.length()-1 ; i>=0; i--)
                out+= input.charAt(i);

            if(out.equals(input))
                return true;
            else
                return false;
        }
 }


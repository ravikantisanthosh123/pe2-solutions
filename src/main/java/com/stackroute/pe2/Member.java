package com.stackroute.pe2;

public class Member {

    class MemberVariable {

        public String[] displayMember(String name, int age, double salary) {

            String[] out = new String[3];

            out[0] = name;
            out[1] = Integer.toString(age);
            out[2] = Double.toString(salary);

            return out;
        }
    }
}

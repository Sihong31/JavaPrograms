package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        String myString = "This is a string";
        System.out.println("myString is: " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is: " + myString);
        myString = myString + " \u00A9 2019";
        System.out.println("myString is: " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("numberString: " + numberString);
        // 250.5549.95

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("lastString: " + lastString);
        // 1050

        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println("lastString: " + lastString);
        // 1050120.47
    }
}

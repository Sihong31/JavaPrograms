package com.company;

public class Main {

    public static void main(String[] args) {
        // width of 16 (2 bytes)
        char mySingleChar = 'a';
	    char myChar = '\u00A9';
        System.out.println("Unicode: " + myChar);

        boolean isMale = true;
        System.out.println("My Boolean: " + isMale);

        char registeredSymbol = '\u00AE';
        System.out.println("Unicode: " + registeredSymbol);
    }
}

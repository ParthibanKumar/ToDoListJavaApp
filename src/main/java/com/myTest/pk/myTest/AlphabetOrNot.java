package com.myTest.pk.myTest;

import java.util.Scanner;

public class AlphabetOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter single character: ");

        if (scanner.hasNext()) {
            String input = scanner.next();
                if (input.length() == 1){
                    char character = input.charAt(0);
                    System.out.println("Entered Value is: " + character );
                        if ( (character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z') ) {
                            System.out.println("Entered value: " + character + " is an Alphabet");
                        }
                        else {
                            System.out.println("Entered value: " + character + " is not an Alphabet");
                        }

                }
                else {
                    System.out.println("Entered value: "  + input +" is not a single Alphabet");
                }

        }
        else {
            System.out.println("Please enter the correct value from a-z or A-Z");
        }
    }
}

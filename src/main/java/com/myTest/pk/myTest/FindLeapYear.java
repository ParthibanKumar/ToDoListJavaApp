package com.myTest.pk.myTest;

import java.util.Scanner;

public class FindLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Value: ");

        if (scanner.hasNextInt())
        {
            var year = scanner.nextInt();
            System.out.println("Entered value is: " + year);
            if ( (year % 4 == 0 && year % 100 !=0) || year % 400 ==0)
            {
                System.out.println("Yes " + year + " It's a Leap year");
            }
            else
            {
                System.out.println("Yes " + year + " It's not a Leap year");
            }
        }
        else
        {
            var year = scanner.next();
            System.out.println("Entered value is: " + year + " is not a integer");
        }


    }
}

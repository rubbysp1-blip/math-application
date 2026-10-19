package com.pluralsight;
import java.util.*;

public class payrollCalculator {
    public static void main(String[] args) {

        //Create a copy of the scanner
        Scanner input = new Scanner(System.in);

        //Ask for their name
        System.out.print("What is your name: ");
        String userName = input.nextLine();

        //Ask how many hours they worked
        System.out.print("Hours worked: ");
        float hoursWorked = input.nextFloat();

        //Ask how much they make each hour
        System.out.print("Your pay rate: ");
        float payRate = input.nextFloat();

        //Print out the gross pay
        printOutput(userName, hoursWorked, payRate);
    }

    public static float grossPay (float hoursWorked, float payRate){

        return hoursWorked * payRate;

    }

    public static void printOutput(String userName, float hoursWorked, float payRate){

        System.out.printf("------------------------\n" +
                "Name: %s \nGross Pay: $%,.2f%n", userName, grossPay(hoursWorked, payRate));

    }
}

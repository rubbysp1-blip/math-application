package com.pluralsight;
import java.util.*;

public class payrollCalculator {
    public static void main(String[] args) {

        //Create a copy of the scanner
        Scanner input = new Scanner(System.in);

        //Ask for their name
        System.out.println("What is your name: ");
        String userName = input.next();

        //Ask how many hours they worked
        System.out.printf("Hours worked: ");
        float hoursWorked = input.nextFloat();

        //Ask how much they make each hour
        System.out.printf("Your pay rate: ");
        float payRate = input.nextFloat();

        //Variable to hold the math equation (gross pay)
        float grossPay = hoursWorked * payRate;

        //Print out the gross pay
        System.out.println("Name: " + userName + "\n" + "Gross Pay: " + grossPay);
    }
}

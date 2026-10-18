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
        System.out.printf("Hours worked: ");
        float hoursWorked = input.nextFloat();

        //Ask how much they make each hour
        System.out.printf("Your pay rate: ");
        float payRate = input.nextFloat();

        //Print out the gross pay
        System.out.print("Name: " + userName + "\n" + "Gross Pay: " + grossPay(hoursWorked, payRate));
    }

    public static float grossPay (float hoursWorked, float payRate){

        return hoursWorked * payRate;

    }
}

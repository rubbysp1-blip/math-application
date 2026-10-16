package com.pluralsight;
import java.util.*;

public class payrollCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is your name: ");
        String userName = input.next();

        System.out.printf("Hours worked: ");
        float hoursWorked = input.nextFloat();

        System.out.printf("Your pay rate: ");
        float payRate = input.nextFloat();

        float grossPay = hoursWorked * payRate;

        System.out.println("Name: " + userName + "\n" + "Gross Pay: " + grossPay);
    }
}

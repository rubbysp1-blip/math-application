package com.pluralsight;
import java.util.*;

public class basicCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = input.nextInt();

        System.out.println("Possible calculations:\n" +
                "(A)dd\n" + "(S)ubtract\n" + "(M)ultiply\n" + "(D)ivide\n" +
                "Please select an option: ");
        char arthmetic = input.next().charAt(0);

        if (arthmetic == 'M'){
            int multiplicationTotal = firstNumber * secondNumber;
            System.out.println(firstNumber + " * " + secondNumber + " = " + multiplicationTotal);
        }


    }
}

package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

        //Create two variables to represent the salary for Bob and Gary, name them
        //bobSalary and garySalary. Create a new variable named
        //highestSalary.
        int bobSalary;
        int garySalary;
        int highestSalary;

        //Determine which salary is greater using Math.max() and store the answer in highestSalary.
        //Set the initial salary variables to any value
        //you want.
        bobSalary = 60000;
        garySalary = 80000;
        highestSalary = Math.max(bobSalary, garySalary);

        //Print the answer (i.e "The highest salary is …")
        System.out.println("The highest salary is $" + highestSalary);

        //Set the variables to any value you want.
        int carPrice = 45000;
        int truckPrice = 100000;
        int lowestPrice = Math.min(carPrice, truckPrice);

        //Find and display the smallest of two variables named carPrice and
        //truckPrice.
        System.out.println("The lowest price is $" + lowestPrice);

        //Find and display the area of a circle whose radius is 7.25
        double areaCircle = Math.PI * (Math.pow(7.25,2));

        //Print out the area number
        System.out.println("Area of a circle with radius of 7.25: " + areaCircle);

        //Find and display the square root of a variable after it is set to 5.0
        int numberEntered;

        //Set the value to 5
        numberEntered = 5;

        //Print out the square root
        System.out.println("The square root of " + numberEntered + " is " + Math.pow(numberEntered,2));

        //Find and display the distance between the points (5, 10) and (85, 50)
        int distanceX = 85 - 5;
        int distanceY = 50 - 10;

        System.out.println("The distance difference between (5,10) and (85,50) is " + "(" + distanceX + ", " + distanceY + ")");
        //Find and display the absolute (positive) value of a variable after it is set to -3.8
        //Find and display a random number between 0 and 1
        //Calculate how many minutes are in 24 days, use a variable for each value you
        //calculate with. BONUS: How many milliseconds?
    }
}

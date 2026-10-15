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

        System.out.println("Area of a circle with radius 7.25: " + areaCircle);
    }
}

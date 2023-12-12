package com.DevubTech;

import java.util.Scanner;

public class Calculator{


    public static void main(String[] args) {

        System.out.println("A SIMPLE CALCULATOR THAT CAN PERFORM BASIC OPERATIONS: ");
        System.out.println("For Addition press -> +\nFor Subtraction press -> -\nFor Multiplication press -> *\nFor Division press -> /");
        System.out.println("===========================================================================================");

        int num1 = 0;
        int num2 = 0;
        char operator;
        double answer = 0.000;

        Scanner inputOperator = new Scanner(System.in);

        // Declare Operation
        System.out.print("What operation do you want to perform:");
        operator = inputOperator.next().charAt(0);

        // Create condition for when user enter the required value
        if (operator == '+') {
            System.out.println("You have chosen (ADDITION)");
        }else if (operator == '-'){
            System.out.println("You have chosen (SUBTRACTION) ");
        }else if (operator == '*') {
            System.out.println("You have chosen (MULTIPLICATION)");
        }else if (operator == '/') {
            System.out.println("You have chosen (DIVISION)");
        }else {
            System.out.println("ERROR!!!...That operation is NOT VALID please try Another");
            System.exit(1);
        }


        // Create try..catch..finally Exception to Detect false input
        try {
            // Enter First Number
            System.out.print("Enter the First Number: ");
            num1 = inputOperator.nextInt();

            // Enter Second number
            System.out.print("Enter the Second Number: ");
            num2 = inputOperator.nextInt();

            // Initialize Catch Expression
        } catch (Exception e) {
            System.out.println("PLEASE ENTER ONLY NUMBERS!!!");
            System.out.println("EXITING......");
            System.exit(1); // If user enters wrong input Exit the Program
        }finally {

            // Calculator's Operation Switch expression
            switch (operator) {
                case '+': answer = num1 + num2;
                        break;
                case '-': answer = num1 - num2;
                        break;
                case '*': answer = num1 * num2;
                        break;
                case '/': answer = num1 / num2;
                        break;
            }
        }

        System.out.println("CALCULATING.........");
        System.out.println("The Correct Answer is: " + answer);

    }
}

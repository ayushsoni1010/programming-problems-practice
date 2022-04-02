//9.	Write a program to swap two numbers without using third variable.
package com.assignment;
import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        System.out.println("EN20CS302013 AYUSH SONI");
        Scanner input = new Scanner (System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        System.out.println("Before swapping number1 = " + num1 + " and number2 = " + num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("After swapping number1 = " + num1 + " and number2 = " + num2);
    }
}

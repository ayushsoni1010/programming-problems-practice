//2.	Write a program to perform arithmetic operations such as addition, subtraction, multiplication and division of two numbers.
package com.assignment;
import java.util.Scanner;

public class ArithmeticOperations{
    public static void main(String[] args){
        System.out.println("EN20CS302013 AYUSH SONI");
        Scanner input = new Scanner(System.in);
        int num1, num2;
        num1 = input.nextInt();
        num2 = input.nextInt();

        System.out.println("Addition of num1 and num2 is: " + (num1 + num2));
        System.out.println("Subtraction of num1 and num2 is: " + (num1 - num2));
        System.out.println("Multiplication of num1 and num2 is: " + (num1 * num2));
        System.out.println("Division of num1 and num2 is: " + (num1 / num2));
    }
}
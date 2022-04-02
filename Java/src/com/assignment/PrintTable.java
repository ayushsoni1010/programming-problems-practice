//12.	Write a program to print a table of any given number.
package com.assignment;
import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args) {
        System.out.println("EN20CS302013 AYUSH SONI");
        Scanner input = new Scanner (System.in);
        System.out.print("Enter any number :");
        int num = input.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }
}

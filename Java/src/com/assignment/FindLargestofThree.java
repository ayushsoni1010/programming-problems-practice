//8.	Write a program to find largest no is 3 numbers.
package com.assignment;
import java.util.Scanner;

public class FindLargestofThree {
    public static void main(String[] args) {
        System.out.println("EN20CS302013 AYUSH SONI");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number");
        int a = input.nextInt();
        System.out.println("Enter the second number");
        int b = input.nextInt();
        System.out.println("Enter the third number");
        int c = input.nextInt();

        int max = Math.max(c, Math.max(a,b));
        System.out.println("The largest number is: " + max);
    }
}

//13.	Write a program to print reverse of a given number.
package com.assignment;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("EN20CS302013 AYUSH SONI");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = input.nextInt();
        int rem, rev = 0;
        while(num > 0){
            rem = num % 10;
            num=num / 10;
            rev=rev * 10 + rem;
        }
        System.out.println("Reversed number: " + rev);
    }

}

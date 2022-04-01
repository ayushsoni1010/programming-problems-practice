//4.	Write a program to check given number is even number or odd number.
package com.assignment;
import java.util.Scanner;

public class CheckEvenOrOdd {
    public static void main(String[] args) {
        System.out.println("EN20CS302013 AYUSH SONI");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = input.nextInt();
        System.out.println(isEvenNumber(num));
    }
    static boolean isEvenNumber(int num){
        if(num % 2 == 0){
            System.out.println("Given number is Even");
            return true;
        }else{
            System.out.println("Given number is Odd");
            return false;
        }
    }
}

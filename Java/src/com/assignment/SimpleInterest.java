//3.	Write a program to calculate simple interest.
package com.assignment;
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args){
        System.out.println("EN20CS302013 Ayush Soni");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Principle:");
        int principle = input.nextInt();
        System.out.println("Enter Interest Rate:");
        float rate = input.nextFloat();
        System.out.println("Enter time");
        int time = input.nextInt();

        double simpleInterest = (principle * rate * time) / 100;
        System.out.println("Simple Interest: " + simpleInterest);
    }
}

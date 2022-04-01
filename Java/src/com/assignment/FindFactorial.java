//6.	Write a program to calculate factorial of given number.
package com.assignment;
import java.util.Scanner;

public class FindFactorial {
    public static void main(String[] args){
        System.out.println("EN20CS302013 AYUSH SONI");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();
        input.close();
        System.out.println("Factorial of a given number is: " + fact(n));
    }
    static int fact(int n){
        if(n == 0){
            return 1;
        }
        return (n * fact(n - 1));
    }
}

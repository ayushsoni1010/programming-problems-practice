//5.	Write a program to check given no is prime number or non-prime number also print all prime numbers between 1 to 100.
package com.assignment;
import java.util.Scanner;

public class CheckPrimeNumber{
    public static void main(String[] args) {
        System.out.println("EN20CS302013 AYUSH SONI");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = input.nextInt();

        if(isPrime(num)){
            System.out.println("Given number: " + num + " is Prime");
        }else{
            System.out.println("Given number: " + num + " is not Prime");
        }

        for (int i = 0; i < 100; i++) {
            if(isPrime(i)){
                System.out.print(i + ", ");
            }
        }
    }

    static boolean isPrime(int num) {
        if(num <= 1){
            return false;
        }
        int count = 2;
        while(count * count <= num){
            if(num % count == 0){
                return false;
            }
            count++;
        }
        return count * count > num;
    }
}
package com.questions;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        isPrime(num);
    }

    static void isPrime(int number) {
        int count = 2;
        if(number <= 1){
            System.out.println("Not Prime");
        }

        while(count * count <= number){

            if(number % count == 0){
                System.out.println("83Not Prime");
                break;
            }
            count++;
        }

        if(count * count > number){
            System.out.println("Prime");
        }
    }
}

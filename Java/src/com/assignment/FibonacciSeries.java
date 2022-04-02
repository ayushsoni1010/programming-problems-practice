//11.	Write a program to print first 10 terms of Fibonacci series.
package com.assignment;

public class FibonacciSeries{
    public static void main(String[] args){
        System.out.println("EN20CS302013 AYUSH SONI");
        System.out.println("First 10 terms of Fibonacci series :");
        for (int i = 0; i < 10; i++) {
            System.out.print(findFibonacciSeries(i) + ", ");
        }
    }
    static int findFibonacciSeries(int num){
        int previous = 0;
        int currentIndex = 1;
        int count = 2;

        if(num == 0){
           currentIndex = 0;
           return currentIndex;
        }

        while(count <= num){
            int temp = currentIndex;
            currentIndex = currentIndex + previous;
            previous = temp;
            count++;
        }
        return currentIndex;
    }
}
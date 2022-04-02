//10.	Write a program to print pattern:
package com.assignment;

public class PrintStarPattern {
    public static void main(String[] args) {
        System.out.print("EN20CS302013 AYUSH SONI");
        for (int i = 1; i <= 5; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
        }
    }
}

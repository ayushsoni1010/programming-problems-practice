//14.	Write a program to convert decimal value to binary value.
package com.assignment;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.println("EN20CS302013 AYUSH SONI");
        System.out.println("Enter the number: ");
        Scanner input = new Scanner(System.in);
        int decimal_num = input.nextInt();
        System.out.println("Decimal Number = " + decimal_num);
        int binary_num[] = new int[100], i;
        for( i = 0; decimal_num > 0; i++){
            binary_num[i] = decimal_num % 2;
            decimal_num = decimal_num / 2;
        }
        System.out.print("Binary Number is : ");
        for(int j = i-1; j >=0; j--){
            System.out.print(binary_num[j]);
        }
    }
}

//17.	Write a program to calculate electricity bill.
package com.assignment;
import java.util.Scanner;

public class CalcElectricityBill {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("EN20CS302013 AYUSH SONI");
        System.out.println("Enter the units consumed: ");
        int unit = input.nextInt();
        int bill = 0;
        if (unit >= 0 && unit <= 100){
            bill = 200 + 2 * unit;
        }
        else if( unit >=101 && unit <=150){
            bill = 200 + 3 * unit;
        }
        else if( unit <= 151){
            bill = 200 + 7 * unit;
        }
        System.out.print("Electricity Bill: " + bill + " Rs");
    }
}

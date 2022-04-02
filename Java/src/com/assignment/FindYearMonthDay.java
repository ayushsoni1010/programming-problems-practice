//15.	Write a program which accepts days as an integer (eg.700) and display total number of years, months and days in it.
package com.assignment;
import java.util.Scanner;

public class FindYearMonthDay {
    public static void main(String[] args) {
        System.out.println("EN20CS302013 AYUSH SONI");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the total Days: ");
        int total_Days = input.nextInt();
        int year, months, days;
        year = total_Days / 365;
        months = (total_Days - year * 365) / 30;
        days = total_Days - year * 365 - months * 30;
        System.out.println(total_Days+" Days = "+ year + " years " + months + " months and " + days + " days.");
    }
}

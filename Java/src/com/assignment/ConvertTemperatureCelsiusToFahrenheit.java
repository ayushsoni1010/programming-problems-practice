//7.	Write a program to convert temperature from Fahrenheit to Celsius.
package com.assignment;
import java.util.Scanner;

public class ConvertTemperatureCelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the temperature in C: ");
        float tempC = input.nextFloat();
        float tempF = (tempC * 9/5) + 32;

        System.out.println("Fahrenheit Temperature: " + tempF);
    }
}

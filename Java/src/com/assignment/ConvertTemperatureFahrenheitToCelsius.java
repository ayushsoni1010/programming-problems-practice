//7.	Write a program to convert temperature from Fahrenheit to Celsius.
package com.assignment;
import java.util.Scanner;

public class ConvertTemperatureFahrenheitToCelsius {
    public static void main(String[] args) {
        System.out.println("EN20CS302013 AYUSH SONI");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the temperature in Fahrenheit: ");
        float tempFahrenheit = input.nextFloat();
        float tempCelsius = (tempFahrenheit - 32) * 5/9;

        System.out.println("Celsius Temperature: " + tempCelsius);
    }
}

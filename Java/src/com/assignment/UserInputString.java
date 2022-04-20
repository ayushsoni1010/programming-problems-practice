package com.assignment;
import java.util.Scanner;

public class UserInputString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("EN20CS302013 Ayush Soni");
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        System.out.print("You have entered: " + str);
    }
}

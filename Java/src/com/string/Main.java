package com.string;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String firstName, lastName;
        firstName = input.nextLine();
        lastName = input.nextLine();

        System.out.println(firstName + " " + lastName);
        lastName = lastName.concat( " " + firstName);
        System.out.println(lastName);
        System.out.println(lastName.length());
        System.out.println(lastName.toUpperCase());
        System.out.println(lastName.toLowerCase());
}
}
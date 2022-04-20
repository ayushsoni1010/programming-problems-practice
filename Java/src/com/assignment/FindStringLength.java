package com.assignment;
import java.util.Scanner;

public class FindStringLength {
    public static void main(String[] args) {
        System.out.println("EN20CS302013 AYUSH SONI");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String : ");
        String s = input.nextLine();

        System.out.println("Length of String : " + s.length());
    }
}

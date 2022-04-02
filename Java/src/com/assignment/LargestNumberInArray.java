//19. Write a program to print largest number in array.
package com.assignment;
import java.util.Scanner;

public class LargestNumberInArray {
    public static void main(String[] args) {
        System.out.println("EN20CS302013 AYUSH SONI");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the no of elements in array: ");
        int n = input.nextInt();
        int arr[] = new int [n];
        System.out.print("Enter the values of array: ");
        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }
        int largest = arr[0];
        for(int i = 1; i < n; i++){
            if(arr[i] > largest) {
                largest= arr[i];
            }
        }
        System.out.println("Largest number in the array: " + largest);
    }
}

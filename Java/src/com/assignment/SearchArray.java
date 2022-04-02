//18. Write a program to check given value is available in array or not, also print the position in array.
package com.assignment;
import java.util.Scanner;

public class SearchArray {
    public static void main(String[] args) {
        System.out.println("EN20CS302013 AYUSH SONI");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the no of elements in array: ");
        int n = input.nextInt();
        int arr[] = new int [n];
        System.out.print("Enter the values of array :");
        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }
        System.out.print("Enter the value to be searched in given array :");
        int value = input.nextInt();
        for(int i = 0; i < n; i++){
            if(arr[i] == value){
                System.out.println("Value found in array at position: " + ( i + 1));
                break;
            }
        }
    }
}

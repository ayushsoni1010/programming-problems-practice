//16.	If the employee’s salary given by the user, write a program to find his gross salary.
package com.assignment;
import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        float HRA, DA, GS;
        System.out.println("EN20CS302013 AYUSH SONI");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Basic salary :");
        int basic_salary = input.nextInt();
        if(basic_salary <= 5000){
            HRA = 20 * basic_salary / 100;
            DA = 50 * basic_salary / 100;
            GS = basic_salary + HRA + DA;
            System.out.println("Gross Salary: " + GS + " Rs");
        }
        else if(basic_salary >= 5000){
            HRA = 2000;
            DA = 75 * basic_salary / 100;
            GS = basic_salary + HRA + DA;
            System.out.println("Gross Salary: " + GS + " Rs");
        }
    }
}

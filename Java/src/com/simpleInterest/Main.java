package com.simpleInterest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello World");
        SimpleInterest obj = new SimpleInterest();
        obj.getData();
        obj.computeInterest();

    }
    static class SimpleInterest{
        double principal;
        float rate;
        int time;
        void getData(){
            Scanner input = new Scanner(System.in);
            principal = input.nextDouble();
            rate = input.nextFloat();
            time = input.nextInt();
        }
        void computeInterest(){
            double countInterest = (principal * rate * time)/100;
            System.out.println(countInterest);
        }
    }
}

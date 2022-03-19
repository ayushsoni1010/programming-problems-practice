package com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Triangle obj = new Triangle();
        obj.getData();
        obj.displayArea();
        Rectangle obj2 = new Rectangle();
        obj2.getData();
        obj2.displayArea();
    }
    static class Shape{
        double width,height;
        float rate;
        void getData(){
            Scanner input = new Scanner(System.in);
            width = input.nextDouble();
            height = input.nextDouble();
        }
    }
    static class Triangle extends Shape{
        double area;
        void displayArea(){
            area = (width * height ) * 1/2;
            System.out.println(area);
        }
    }
    static class Rectangle extends Shape{
        double area;
        void displayArea(){
            area = width * height;
            System.out.println(area);
        }
    }
}

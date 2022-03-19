package com.InterfaceProblem;

public class Main {
    public static void main(String[] args){
        System.out.println("Afternoon Man");
        A obj1 = new A(50,50,50);
    }
    interface Marks{
        public void getPercentage();
    }
    static class A implements Marks{
        int mark1, mark2, mark3;
        A(int mark1, int mark2, int mark3){
            this.mark1 = mark1;
            this.mark2 = mark2;
            this.mark3 = mark3;
        }
        public void getPercentage(){
            System.out.println("Total Percentage: "+ (mark1 * mark2 * mark3) / 100 );
        }
    }
}

package com.assignment;

public class CreatingThread {
    public static void main(String[] args) {
        System.out.println("EN20CS302013 AYUSH SONI");
        Multi obj = new Multi();
        obj.start();
    }
    static class Multi extends Thread{
        public void run(){
            System.out.println("Thread is running...");
        }
    }
}

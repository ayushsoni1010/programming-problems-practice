package com.assignment;

public class StringImmutable {
    public static void main(String[] args) {
        System.out.println("EN20CS302013 AYUSH SONI");
        String fname = "Ayush";
        String lname = "Soni";
        fname.concat(lname);
        // this will concat lname to fname but fname is still pointing towards
        // Ayush so Ayush will be printed only

        System.out.println("Full name : " + fname);
    }
}

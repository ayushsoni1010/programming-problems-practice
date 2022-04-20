package com.assignment;

public class CheckStringEmpty {
    public static void main(String[] args) {
        System.out.println("EN20CS302013 Ayush Soni");
        String str1 = null;
        String str2 = "";
        String str3 = " ";
        System.out.println("str1 is " + isNullEmpty(str1));
        System.out.println("str2 is " + isNullEmpty(str2));
        System.out.println("str3 is " + isNullEmpty(str3));
    }

    static String isNullEmpty(String str) {
        if (str == null) {
            return "NULL";
        }
        else if (str.isEmpty()) {
            return "EMPTY";
        }
        else {
            return "neither NULL nor EMPTY";
        }
    }
}

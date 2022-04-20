package com.assignment;

public class UseStringBuffer {
    public static void main(String[] args) {
        System.out.println("EN20CS302013 Ayush Soni");
        StringBuffer str = new StringBuffer("Hello");
        str.append(" World");
        System.out.println(str);

        String s = "Hello";
        s.concat(" World");
        System.out.println(s);
    }
}

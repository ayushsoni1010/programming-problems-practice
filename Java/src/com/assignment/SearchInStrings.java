package com.assignment;

public class SearchInStrings {
    public static void main(String[] args) {
        System.out.println("EN20CS302013 AYUSH SONI");
        String s = "If I had been open to you from the start, and looked you in the eye and told you the truth,"
        + "I wouldn't have to stand before you now, as a failure,"
        + "telling you all this. So this time I want to impart this truth with";

        int num = s.indexOf("failure");
        if(num == -1){
            System.out.println("Word not found");
        }
        else{
            System.out.println("Word found at index : " +num);
        }
    }

}

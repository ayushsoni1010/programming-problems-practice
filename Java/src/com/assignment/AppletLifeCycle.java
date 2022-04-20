package com.assignment;
import java.applet.*;
import java.awt.*;

public class AppletLifeCycle extends Applet {
    public static void main(String[] args) {
        System.out.println("EN20CS302013 AYUSH SONI");
    }
    public void init() {
        setBackground(Color.CYAN);
        System.out.println("init() called");
    }
    public void start(){
        System.out.println("Start() called");
    }
    public void paint(Graphics g){
        System.out.println("Paint() called");
    }
    public void stop(){
        System.out.println("Stop() called");
    }
    public void destroy() {
        System.out.println("Destroy() called");
    }
}


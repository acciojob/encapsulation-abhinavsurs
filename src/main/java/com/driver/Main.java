package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj1=new RWOnly();
       // java: name has private access in com.driver.RWOnly
        obj1.setName("abhinav");
        obj1.getName();
    }
}
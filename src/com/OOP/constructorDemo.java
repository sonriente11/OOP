package com.OOP;

public class constructorDemo {
    public static void main(String[] args) {
        constructorDemo cd = new constructorDemo();
        //whenever you create an object constructor is called
        //constructor - block of code whenever an object is created -> invoked each run
    }

    public constructorDemo() {
        System.out.println("I am in the constructor");
    }

    public void getData() {
        System.out.println("I am the mothod");
    }
    //will not return values
    //name of constructor should be the class name

}

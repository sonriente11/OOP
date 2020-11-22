package com.OOP;

public abstract class ParentAirCraft {
    //this method is not abstract:
    public void engine()
    {
        System.out.println("Follow Engine Guidelines");
    }
    public void safetyGuidelines(){
        System.out.println("Follow Safety Guidelines");
    }
    public abstract void bodyColor(); //I don't have implementation for this method, I am hidding it. Firstly, the method throws an error (sugestions: Add body or change the method to abstract
}

package com.OOP;

public class thisKeyWord {
    int a = 2; //we say that this variable is global
    public void getData (){
        int a = 3; //we say that this variable is local
        int b = a + this.a;
        System.out.println("I will print the value in the method "+ a); //will print 3
        System.out.println("I will print the value in the main class/ object "+this.a); // will print 2
        System.out.println("I will print the value in the main class/ object plus the value in the method "+b); // will print 5
    }
    public static void main(String[] args) {
        thisKeyWord th = new thisKeyWord();
        th.getData();
    }
}

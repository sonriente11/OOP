package com.OOP;

public class finalKeyWord {
    //if you mark the class with "final" -> you cannot extend that class anymore; you cannot use it as a parent class
    int op = 2;
    final int count = 3; // it is a constant value! cannot be changed
    public final void getCount(){ //to make sure that the method will not be override 
        System.out.println(count);
        System.out.println(op);
    }

    public static void main(String[] args) {
        finalKeyWord fk = new finalKeyWord();
        fk.getCount();
    }
}

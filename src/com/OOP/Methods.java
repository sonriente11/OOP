package com.OOP;
import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
//objects are the instances/ references of a class
        Methods m = new Methods();
        m.printing("Print that text!");
        System.out.println(m.a);


        //Create another class Methods_2
        Methods_2 m2 = new Methods_2();
        m2.setData();


    }

    //method is outside the main block
    public void printing(String printText) {
        System.out.println(printText);
    }
    // again outside the main block
    int a = 2;

}


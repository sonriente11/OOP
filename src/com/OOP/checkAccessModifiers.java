package com.OOP;

public class checkAccessModifiers {

    public static void main(String[] args) {
        accessModifiers am = new accessModifiers();
        am.abcPublic();
        am.abcDefault();
        System.out.println(am.iAmPublic);
        System.out.println(am.iAmDefault);
    }

}

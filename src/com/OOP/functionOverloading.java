package com.OOP;
public class functionOverloading {
    public static void main(String[] args) {
       functionOverloading fo = new functionOverloading();
       fo.get_data(1);
       fo.get_data("textMe");
    }

    public void get_data (int a) {
        System.out.println(a);
    }
    public void get_data (String text) {
        System.out.println(text);
    }

}

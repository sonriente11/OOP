package com.OOP;

public class childDemo1 extends parentDemo1 {
    String name = "CRI in childDemo1 class";

public void childDemo1 () {
   //super() it should be the first line in child constructor
    System.out.println("Child class constructor");
}
    public void getStringdata() {
        System.out.println("GetStringData name" + name);
        System.out.println("GetStringData super.name" + super.name); // it will print the name from the parentDemo1 class
        //super is a key word - refers to the parent class
    }

    public void getData() {
        super.getData();
        System.out.println("I am in the child class");
    }

    public static void main(String[] args) {
        childDemo1 cd = new childDemo1();
         parentDemo1 pd = new parentDemo1();

        cd.getStringdata(); // it will print the name from the childDemo1 class
        cd.getData();
        System.out.println("I am pd.name " + pd.name); // it will print the name from the parentDemo1 class
        System.out.println("I am cd.name " + cd.name); // it will print the name from the childDemo1 class

    }

}

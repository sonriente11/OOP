package com.OOP;

public class ChildEmirites extends ParentAirCraft{
    //firstly, you will get an error with two solutions: implement a method (because there are not implemented methods in our ParentAirCraft class), and second "to make it abstract"

    public static void main(String[] args) {
        //... if you select to implement the methods hover on a class name and select "implement methods" and you will get "
        // @Override
        //    public void bodyColor() {
        //
        //    }"
//then you should create an object in order to use that method
        ChildEmirites ce = new ChildEmirites();
        ce.bodyColor(); //the method that is defined in the current class
        ce.engine(); // the method from the extended class - because of the inheritance
//if you try to create an object from ParentAirCraft you will get an error, if you removed "abstract from ParentAirCraft the error will not be there anymore
  //You cannot instant abstract classes not correct: ParentAirCraft pc = ParentAirCraft();
    }

    @Override
    public void bodyColor() {
        //write a code for that method
        System.out.println("I extend ParentAirCraft abstract class and I defined bodyColor Method");
    }
}

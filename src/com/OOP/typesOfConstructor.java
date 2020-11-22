package com.OOP;

public class typesOfConstructor {
public typesOfConstructor (){
    System.out.println("I am in the constructor!");
}
public typesOfConstructor(int a, int b){
    System.out.println(" I am in the parameterized constructor " + (a + b));
}
    public typesOfConstructor(String str){
        System.out.println(str);
    }

    public static void main(String[] args) {
        typesOfConstructor tc1 = new typesOfConstructor(); // if this object is created the first constructor will be executed
        typesOfConstructor tc2 = new typesOfConstructor(3,4); // if this object is created the second constructor will be executed
        typesOfConstructor tc3 = new typesOfConstructor("Hello"); // if this object is created the third constructor will be executed
    }
    //compiler will call implicit constructor if you have not defined constructor
}

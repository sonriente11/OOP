package com.OOP;

public class staticVariable {
    //the following 3 variables are called Instance:
    String name;
    String address;
    static String city = "Sofia"; //class variables
    static int i = 0;
     int j = 0;

    staticVariable(String name, String address) { //those variables are local (inside the method block)
        this.name = name;
        this.address = address;
        i++;
        j++;
        System.out.println("i values "+ i); // the output will be 1 and then 2 (because it is a class variable
        System.out.println("j values "+ j); // the output will be 1 and then 1 again (because it is an instance variable

    }

    public void getAddress() {
        System.out.println(address + " " + city);
    }

    public static void getCity(){  //static method will accept only static
        System.out.println(city); // city is static variable

    }


    public static void main(String[] args) {
        staticVariable sv1 = new staticVariable("Cri1", "Center1");
        staticVariable sv2 = new staticVariable("Cri2", "Center2");
        sv1.getAddress();
        sv2.getAddress();
        staticVariable.getCity(); //because static methods are class methods -> if it is a static you should call it like here
        staticVariable.i=4;
        sv1.address="Lom"; // if it is not static you should call it like this
    }
}

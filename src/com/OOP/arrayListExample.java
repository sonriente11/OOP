package com.OOP;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class arrayListExample {
    //can accept duplicate values
    //array has fixed size where as arraylist can grow dynamicaly
    //you can access and insert any value in any index.
    public static void main(String[] args) {
        ArrayList <Integer> a = new ArrayList<Integer>();
        ArrayList <String> str = new ArrayList<String>();


a.add(23);
a.add(44);
a.add(2,3);
a.remove(2);
        System.out.println(a);

        System.out.println("Print Get " + a.get(1));
        System.out.println(a.contains(55));
        System.out.println(a.indexOf(44));
        System.out.println(a.isEmpty());
        System.out.println(a.size());
    }


}

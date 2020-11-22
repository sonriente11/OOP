package com.OOP;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetExample {
    public static void main(String[] args) {
      //HashSet treeset, LinkedHashset implements Set intergace
        //does not accept duplicate values
        //there is no guaranteee elements are stored in a sequential order

        HashSet <String> hs = new HashSet<String>();
        hs.add("USA");
        hs.add("UK");
        hs.add("India");
        hs.add("India");
        hs.add("Canada");
        hs.add("Germany");

        System.out.println(hs);
        System.out.println(hs.remove("UK"));
        System.out.println(hs.isEmpty());
        System.out.println(hs.size());

       Iterator<String> i= hs.iterator();
        System.out.println("i.next " + i.next());
        System.out.println("i.next " + i.next());
        while (i.hasNext()){
            System.out.println("I am in the while loop " +i.next());
        }

    }
}

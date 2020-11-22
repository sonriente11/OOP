package com.OOP;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMapExample {
    public static void main(String[] args) {
        //we map key to the value

        HashMap<Integer,String> hm = new HashMap(); //the first argument in <> is for a key, the second is for a value
   hm.put(0,"Hello");
   hm.put(1,"Bye");
   hm.put(2,"Morning");
   hm.put(3,"Evening");
        System.out.println(hm.get(2)); //print Morning
        System.out.println(hm.get(4)); //null
        hm.remove("Bye");
        System.out.println("Key and value" + hm.get(1));
        Set  sn = hm.entrySet(); //converting the HashMap to a Set
        Iterator it = sn.iterator();
        while (it.hasNext()){
       Map.Entry mp = (Map.Entry)it.next(); //now it knows that we have a map entries (key-value)
            System.out.println(mp.getKey());
            System.out.println(mp.getValue());
        }



    }
}

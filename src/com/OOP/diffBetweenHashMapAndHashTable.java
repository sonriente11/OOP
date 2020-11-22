package com.OOP;

import java.util.*;

public class diffBetweenHashMapAndHashTable {

        public static void main(String[] args) {
            //we map key to the value

            Hashtable<Integer,String> hm = new Hashtable<>(); //the first argument in <> is for a key, the second is for a value
            hm.put(0,"Hello");
            hm.put(1,"Bye");
            hm.put(2,"Morning");
            hm.put(3,"Evening");
            hm.put(4,null); // possible only for HashMap
            System.out.println(hm.get(2)); //print Morning
            System.out.println(hm.get(4)); //null
            hm.remove("Bye");
            Set sn = hm.entrySet(); //converting the HashMap to a Set
            Iterator it = sn.iterator();
            while (it.hasNext()){
                Map.Entry mp = (Map.Entry)it.next(); //now it knows that we have a map entries (key-value)
                System.out.println(mp.getKey());
                System.out.println(mp.getValue());
            }

//difference between HashMap And HashTable: HashTable is threat safe -> that means:
            //1.When 5 programs are trying to update the hashMap they are not synchronized, they can apply updates at one time
            //when we have HashTable: when we have a thread, the next thread should wait until the first one is accessing the resources
            //When to use HashMap? Answer: if your application do not require any multi-threading task,
            // in other words hashMap is better for non-threading applications.HashTable should be used in multithreading application
//2.Hashmap allows one null key and any number of null values, while Hashtable do not allow null keys and null values in the HashTable object.
    //3. Iterating the values: Hashmap object values are iterated by using iterator. HashTable is the only class other than vector whict uses enumerator to itarate the values of the HashTable object.
        }
    }


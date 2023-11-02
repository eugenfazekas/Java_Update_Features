package com;

import java.util.*;

public class Main {

	public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("key1", 10000);
        map.put("key2", 55000);
        map.put("key3", 44300);
        map.put("key4", 53200);
 
        // print map details
        System.out.println("HashMap:\n " + map.toString());
 
        // provide value for new key which is absent
        // using computeIfAbsent method
        map.computeIfAbsent("key5", k -> 2000 + 33000);
        map.computeIfAbsent("key6", k -> 2000 * 34);
 
        // print new mapping
        System.out.println("New HashMap:\n " + map);
        
        // create a HashMap and add some values
        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(10, "Aman");
        map2.put(20, "Suraj");
        map2.put(30, "Harsh");
 
        // print map details
        System.out.println("HashMap:\n" + map2.toString());
 
        // provide value for new key which is absent
        // using computeIfAbsent method
        map2.computeIfAbsent(40, k -> "Sanjeet");
 
        // this will not effect anything
        // because key 10 is present
        map2.computeIfAbsent(10, k -> "Amarjit");
 
        // print new mapping
        System.out.println("New HashMap:\n" + map2);

	}

}

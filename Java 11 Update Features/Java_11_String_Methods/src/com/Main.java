package com;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        System.out.println(" ".isBlank()); //true
        
        String s = "Anupam";
        System.out.println(s.isBlank()); //false
        String s1 = "";
        System.out.println(s1.isBlank()); //true
        
        //this method returns a stream of strings, which is a collection of all substrings split by lines.
        String str0 = "JD\nJD\nJD"; 
        System.out.println(str0);
        System.out.println(str0.lines().collect(Collectors.toList()));
        
        //strip(), stripLeading(), stripTrailing() strip() -
        //Removes the white space from both, beginning and the end of string.
        String str = " JD "; 
        System.out.print("Start");
        System.out.print(str.strip());
        System.out.println("End");
        
        System.out.print("Start");
        System.out.print(str.stripLeading());
        System.out.println("End");
        
        System.out.print("Start");
        System.out.print(str.stripTrailing());
        System.out.println("End");
        
        //repeat(int) The repeat method simply repeats the string that many 
        //numbers of times as mentioned in the method in the form of an int.
        String str2 = "=".repeat(2);
        System.out.println(str2); //prints ==
    }
}

package com;

import java.util.function.BiFunction;

class Arithmetic{  
	
	public static int add(int a, int b){  
		
		return a+b;  
	}  
}  

interface Sayable{  
    void say();  
} 

public class InstanceMethodReference {  
	
    public void saySomething(){  
        System.out.println("Hello, this is non-static method.");  
    }  
    
    public static void main(String[] args) {  
        InstanceMethodReference methodReference = new InstanceMethodReference(); // Creating object  
        // Referring non-static method using reference  
            Sayable sayable = methodReference::saySomething;  
        // Calling interface method  
            sayable.say();  
            // Referring non-static method using anonymous object  
            Sayable sayable2 = new InstanceMethodReference()::saySomething; // You can use anonymous object also  
            // Calling interface method  
            sayable2.say();  
            
            BiFunction<Integer, Integer, Integer>adder = Arithmetic::add;  
            int result = adder.apply(10, 20);  
            System.out.println(result);  
    }  
    
} 

package com;

class Employee {
	
	public Employee () {}
}

public class Main {

	public static void main(String[] args) {

			System.out.println(getType(5));
	
	}
	
			static String  getType (Object obj) {
				
				return switch (obj) {
			    case Integer i -> "It is an integer";
			    case String s -> "It is a string";
			    case Employee s -> "It is a Employee";
			    case null -> "Object is null";
			     default -> "It is none of the known data types";
			};
		}
}

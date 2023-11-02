package com;

public class Main {

	public record Employee(
						int id,
						String firstName,
						String lastName
						) {}
	
	public static void main(String[] args) {

		//Creating object with default constructor
	    Employee e1 = new Employee(1001, "John", "Doe");

	    // Auto generated getter methods
	    System.out.println(e1.id() + " " + e1.firstName()
	                       + " " + e1.lastName());

	    // Auto-generated toString() method
	    System.out.println(e1.toString());

	}

}

package com;

public class Main {

	public static void main(String[] args) {
		
		//Text Format
			String input = "Hello %s";
	
			String output1 = input.formatted("World");
			System.out.println(output1);
	
			String output2 = input.formatted("Jakob");
			System.out.println(output2);
		      
		//Strip Indent
		    String input1  = "   Hey \n   This \n   is \n   indented.";
		    String output = input1.stripIndent();

		    System.out.println(output);
	}

}

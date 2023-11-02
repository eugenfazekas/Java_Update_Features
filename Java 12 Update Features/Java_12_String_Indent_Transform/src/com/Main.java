package com;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		String str = "**********\n  Welcome\n  Good Morning\n**********";
		System.out.println(str.indent(0));
		System.out.println(str.indent(3));
		
		String s = "Java,Python,Angular";
		Object result = s.transform(s1 -> {return Arrays.asList(s1.split(","));});
		System.out.println(result);

	}

}

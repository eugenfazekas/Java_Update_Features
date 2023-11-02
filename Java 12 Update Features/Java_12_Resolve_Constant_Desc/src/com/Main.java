package com;

import java.lang.invoke.MethodHandles;

public class Main {

	public static void main(String[] args) {
		String message = "Welcome!";
		String constantDesc = message.resolveConstantDesc(MethodHandles.lookup());
		System.out.println(constantDesc);

	}

}

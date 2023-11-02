package com;

import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		
		String message = "Welcome!";
		Optional<String> opOfMessage = message.describeConstable();
		System.out.println(opOfMessage);

	}

}

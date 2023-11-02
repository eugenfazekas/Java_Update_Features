package com;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

	public static void main(String[] args) {

		// Reading a file with UTF-8 encoding
		Path path = Paths.get("file.txt");
		
		try {
			String content = Files.readString(path, StandardCharsets.UTF_8);
			System.out.println(content);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

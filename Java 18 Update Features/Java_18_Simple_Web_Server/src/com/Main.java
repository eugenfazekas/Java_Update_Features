package com;

import java.net.InetSocketAddress;
import java.nio.file.Path;

import com.sun.net.httpserver.SimpleFileServer; 
import com.sun.net.httpserver.SimpleFileServer.OutputLevel; 

public class Main {

	public static void main(String[] args) {

	    // parameters 
	    Integer port = 8080; 
	    String pathToServe = "/"; 
	    OutputLevel outputLevel = OutputLevel.VERBOSE; 
	 
	    // create the server 
	    var server = SimpleFileServer.createFileServer( 
	      new InetSocketAddress(port), 
	      Path.of(pathToServe), 
	      outputLevel); 
	 
	      // start the server 
	      server.start(); 

	}

}

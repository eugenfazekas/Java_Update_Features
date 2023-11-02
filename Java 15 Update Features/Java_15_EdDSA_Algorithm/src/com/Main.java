package com;

import java.nio.charset.StandardCharsets;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.Signature;
import java.util.Base64;

public class Main {

	public static void main(String[] args) {

		KeyPairGenerator kpg ;
		KeyPair kp ;
		Signature sig;
		byte[] s = null;
		byte[] msg = "test_string".getBytes(StandardCharsets.UTF_8);
		
			try {				 
				 kpg = KeyPairGenerator.getInstance("Ed25519");
				 kp  = kpg.generateKeyPair();
				 sig = Signature.getInstance("Ed25519");
				 sig.initSign(kp.getPrivate());
				 sig.update(msg);
				 s = sig.sign();
			}catch (Exception e) {			
		}	 
		String encodedString = Base64.getEncoder().encodeToString(s);
		System.out.println(encodedString);
	}
}

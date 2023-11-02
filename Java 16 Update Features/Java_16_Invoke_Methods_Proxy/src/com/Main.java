package com;

import java.lang.reflect.InvocationHandler;

import java.lang.reflect.Proxy;
interface GreetingInterface {
	  String getName();

	  default String greet() {
	    return "Hello, " + getName();
	  }
	}

public class Main {

	public static void main(String[] args) {

		GreetingInterface greetingProxy = (GreetingInterface) Proxy.newProxyInstance(
				GreetingInterface.class.getClassLoader(),
			    new Class[] {GreetingInterface.class},
			    (proxy, method, arg) -> {
			      if (method.getName().equals("getName")) {
			        return "Sven";
			      } else if (method.isDefault()) {
			        return InvocationHandler.invokeDefault(proxy, method, arg);
			      } else {
			        throw new IllegalStateException(
			            "Method not implemented: " + method);
			      }
			    });

		System.out.println(greetingProxy.greet());
	}
}


package com;


abstract class Animal {
}

final class Cat extends Animal {
    void meow() {
    	System.out.println("MEOW");
    }
}

final class Dog extends Animal {
    void woof() {
    }
}

public class Main {

	
	public static void main(String[] args) {
		
		Cat cat = new Cat();

		performAnimalOperations(cat);
	}
	
	 public static void performAnimalOperations(Animal animal) {
         if (animal instanceof Cat cat) {
             cat.meow();
         } else if(animal instanceof Dog dog) {
             dog.woof();
         }
    }
    
}

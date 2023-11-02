package com;

import java.util.*;  
import java.util.stream.Collectors;
import java.util.stream.Stream; 

class Product{  
	
    int id;  
    String name;  
    float price;  
    
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}  
       
}  
public class JavaStreamExample {  
    public static void main(String[] args) {  
    	
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        
        // filter and map
        List<Product> priceList1 =productsList.stream()  
                                     .filter(p -> p.price > 25000)// filtering data  
                                     .map(p->p)        // fetching price  
                                     .collect(Collectors.toList()); // collecting as list  
        System.out.println(Arrays.asList(priceList1));  
 
        // Stream to float array
        Float [] priceList2 = productsList.stream()  
                                     .filter(p -> p.price > 30000)// filtering data  
                                     .map(p -> p.price)        // fetching price  
                                     .toArray(Float[]::new);
        
        System.out.println(Arrays.asList(priceList2));  
        
        
        //iterate and modify
        List<Product> priceList3 = productsList;  
        priceList3.stream().filter(p -> p.price > 30000)// filtering data  
                .forEach(p -> System.out.println("High Nums parallel="+p.price));
        
        
        // Integer to int    
        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5);
        int[] result = stream2.mapToInt(x -> x).toArray();

        System.out.println(Arrays.toString(result));
    }  
}  

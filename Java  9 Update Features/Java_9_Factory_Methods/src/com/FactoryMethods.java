package com;

import java.util.List;
import java.util.Map;
import java.util.Set;  
public class FactoryMethods {  
    public static void main(String[] args) {  
    	
    	
        List<String> list = List.of("Java","JavaFX","Spring","Hibernate","JSP");  
        for(String l:list) {  
            System.out.println(l);  
        } 
        
    	Set<String> set = Set.of("Java","JavaFX","Spring","Hibernate","JSP");  
    	
        for(String l:set) {  
            System.out.println(l);  
        } 
        
        Map<Integer,String> map = Map.of(101,"JavaFX",102,"Hibernate",103,"Spring MVC");  
        for(Map.Entry<Integer, String> m : map.entrySet()){     
            System.out.println(m.getKey()+" "+m.getValue());  
        }  
    }  
}

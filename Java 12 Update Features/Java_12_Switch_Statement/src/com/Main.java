package com;
;

class Main {
 
      // returns mealNumber

   
    public static void main(String[] args)
    {
 
        // define meal
        String meal = "BURGER";
 
        // print mealNumber
        System.out.println("The mealNumber is : "
                           + getMealNumber(meal));
        

    }
    
    static int getMealNumber(String meal)
    {
 
        // stores mealNumber using
        // new switch expression
        int mealNumber = switch (meal)
        {
 
           case "SOUP" -> 1;
 
           case "BURGER", "CHIPS", "SANDWICH" -> 2;
 
           case "SPAGHETTI", "MACARONI" -> 3;
             
           default -> throw new IllegalStateException("");
        };
 
        return mealNumber;
    }
}

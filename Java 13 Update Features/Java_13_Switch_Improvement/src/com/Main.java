package com;

public class Main {
	
	   public static void main(String[] args) {
		      String day = "Sunday";   // switch on String supported since JDK 7

		      // JDK 13 (Preview) switch expression that evaluates to a value
		      int numLetters =     // Assign the switch expression to a variable
		         switch (day) {
		            case "Monday", "Friday" -> 6;   // single-line expression
		            case "Tuesday" -> 7;
		            case "Thursday" -> 8;
		            case "Wednesday" -> 9;
		            default -> {
		               System.out.println("error");
		               yield 0;    // use "yield" to return a value in a block
		            }
		         };
		      System.out.println("Number of letters: " + numLetters);

		      // switch expression can also use the traditional "case L:" with yield
		      day = "Wednesday";
		      numLetters =
		         switch (day) {
		            case "Monday": case "Friday": yield 6;   // single-line expression
		            case "Tuesday":   yield 7;
		            case "Thursday":  yield 8;
		            case "Wednesday": yield 9;
		            default:
		               System.out.println("error");
		               yield 0;    // use "yield" to return a value in a block
		         };
		      System.out.println("Number of letters: " + numLetters);
		   }
		}

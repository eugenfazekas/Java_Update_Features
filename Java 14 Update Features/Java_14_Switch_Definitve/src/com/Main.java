

package com;

import com.Main.Day;

public class Main {
	
	enum Day {
	    MON, TUE, WED, THUR, FRI, SAT, SUN
	}

	public static void main(String[] args) {

		isWeekDay(Day.MON);

	}

	public static Boolean isWeekDay (Day day) 
	{
	    Boolean result = switch(day) {
	        case MON, TUE, WED, THUR, FRI ->
	        { 
	            System.out.println("It is WeekDay");
	            yield true; 
	        }
	        case SAT, SUN ->
	        { 
	            System.out.println("It is Weekend");
	            yield false; 
	        }
	    };
	    return result;
	}
}

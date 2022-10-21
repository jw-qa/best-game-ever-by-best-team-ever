package com.lbg.coh2;

import java.util.Scanner;

public class UserInput {
	
	
	String lineRead;
	Scanner sc= new Scanner(System.in); 
	
	
	
	public String getUserInput()
	{ 
		prompt();
		
		String currentline="x";
		
		currentline= sc.nextLine();

		return currentline;
	}
	
	 
	
	
	static private boolean prompt()
	    {
	        System.out.print("What is your next move? ");
	        return true;
	    }

}

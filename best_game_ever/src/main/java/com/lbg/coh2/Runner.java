package com.lbg.coh2;

public class Runner {
	
	
	public static void main( String[] args )
    {
		Game runningGame = new Game();   
        UserInput ui= new UserInput();
        
        
        while(runningGame.getDistance() != 0) {
        
        	
        	String currentInput = ui.getUserInput();
        	
        	if(currentInput.equalsIgnoreCase("exit"))
        		break;
        	runningGame.updatePosition(currentInput);
        	
        	System.out.println("Your distance from the treasure is: " + String.format("%.2f",runningGame.getDistance()));
        
        }
        
        System.out.println("GAME OVER! YOU HAVE FOUND THE TREASURE! (OR YOU ARE A QUITTER)");
     
    }
	
	

}

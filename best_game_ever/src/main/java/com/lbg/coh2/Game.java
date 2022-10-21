package com.lbg.coh2;

public class Game {
	
      private int goalX, goalY,playerX, playerY;
	  
	  
	  public void Game() {
		  
		  goalX=0;
		  goalY=7;
		  playerX=0;
		  playerY=3;
		  
	  }
	  
	  public double getDistance() {
			
			return (Math.sqrt(Math.pow(playerX-goalX,2) + Math.pow(playerY- goalY,2)));   
		  }
		  
	  }
	  
	  
	  



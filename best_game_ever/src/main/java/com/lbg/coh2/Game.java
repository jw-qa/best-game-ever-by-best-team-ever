package com.lbg.coh2;

public class Game {
	
      private int goalX, goalY,playerX, playerY,boardW,boardH;
	  
	  public void Game() {
		  
		  goalX=0;
		  goalY=7;
		  playerX=0;
		  playerY=3;
		  boardW=10;
		  boardH=10;
	  }
	  
	  public double getDistance() {
			
			return (Math.sqrt(Math.pow(playerX-goalX,2) + Math.pow(playerY- goalY,2)));   
		  }
	  
	  public void updatePosition(String move) {
		  

		  if ((move.equals("Left") || move.equals("West")) && playerX != 0)
			  playerX -- ;
		  //TODO use getters and setters
		  else if((move.equals("Right") || move.equals("East")) && playerX !=boardW)
			  playerX ++ ;
		  else if((move.equals("Down") || move.equals("South")) && playerY !=0)
			  playerY -- ;
		  else if((move.equals("Up") || move.equals("North")) && playerY !=boardH)
			  playerY ++ ;
		  else
			  System.out.print("You are at the end of the world");
			
		  }
	  public void checkIfReachGoal()
	  {
		  if (goalX == playerX && playerY==goalY)
			  System.out.print("You Win");
	  }
		  
	  }
	  
	  
	  



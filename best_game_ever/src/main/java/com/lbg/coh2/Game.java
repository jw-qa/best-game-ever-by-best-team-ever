package com.lbg.coh2;

public class Game {
	
      private double goalX, goalY,playerX, playerY,boardW,boardH;
	  
	  public Game() {
		  
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
		  

		  if ((move.equalsIgnoreCase("Left") || move.equalsIgnoreCase("West")) && playerX != 0)
			  playerX -- ;
		  //TODO use getters and setters
		  else if((move.equalsIgnoreCase("Right") || move.equalsIgnoreCase("East")) && playerX !=boardW)
			  playerX ++ ;
		  else if((move.equalsIgnoreCase("Down") || move.equalsIgnoreCase("South")) && playerY !=0)
			  playerY -- ;
		  else if((move.equalsIgnoreCase("Up") || move.equalsIgnoreCase("North")) && playerY !=boardH)
			  playerY ++ ;
		  else
			  System.out.println("You are at the end of the world");
			
		  }
//	  public void checkIfReachGoal()
//	  {
//		  if (goalX == playerX && playerY==goalY)
//			  System.out.print("You Win");
//	  }
		  
	  }
	  
	  
	  



package codeWithAljune;
import java.util.Scanner;
import java.util.Random;
public class rockPaperScissors {
	
	public static void main(String[] args) {
		
	while (true) {	
		String playerMove;  
	    String computerMove = "";
	    int computerInt;
	   
	    Scanner sc = new Scanner(System.in); 
	    Random generator = new Random(); 

	    System.out.println("Please enter your move.");
	    System.out.println();
	    System.out.println("R = Rocks");
	    System.out.println("P = Paper");
	    System.out.println("S = Scissors");
	    System.out.println();

	    computerInt = generator.nextInt(3)+1; 

	    if (computerInt == 1) 
	       computerMove = "R"; 
	    else if (computerInt == 2) 
	       computerMove = "P"; 
	    else if (computerInt == 3) 
	       computerMove = "S"; 
	    
	    System.out.print("Enter your move: "); 
	    playerMove = sc.next();

	    playerMove = playerMove.toUpperCase(); 

	    System.out.println("Computer move is: " + computerMove); 
	    System.out.println();
	    
	    if (playerMove.equals(computerMove)) 
	       System.out.println("It's a tie!"); 
	    else if (playerMove.equals("R")) 
	       if (computerMove.equals("S"))
	          System.out.println("Rock crushes scissors. You win!!");
	    else if (computerMove.equals("P")) 
	            System.out.println("Paper eats rock. You lose!!");
	    else if (playerMove.equals("P")) 
	       if (computerMove.equals("S")) 
	       System.out.println("Scissor cuts paper. You lose!!"); 
	    else if (computerMove.equals("R")) 
	            System.out.println("Paper eats rock. You win!!"); 
	    else if (playerMove.equals("S")) 
	         if (computerMove.equals("P")) 
	         System.out.println("Scissor cuts paper. You win!!"); 
	    else if (computerMove.equals("R")) 
	            System.out.println("Rock breaks scissors. You lose!!"); 
	    else 
	         System.out.println("Invalid user input."); 
	    
	}
	}
	

}

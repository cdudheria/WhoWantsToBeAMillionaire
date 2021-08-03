
/**
 * 
 */

/**
  File Name: WhoWantsToBeAMillionaire.java
     Author: chiragdudheria
       Date: Apr. 14, 202111:52:37 p.m.
 Description: Main class
 */
import java.util.*;

public class WhoWantsToBeAMillionaire {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		
		do {
			
			System.out.println("\t\t\t\t\t\t\tWelcome to Who Wants To Be A Millionaire");
			System.out.println("Please enter the desired option");
			System.out.println("1. Start the game");
			System.out.println("2. View the rules of the game");
			System.out.println("3. Exit");
			
			int Option = input.nextInt();	
			
		if (Option == 1) {
			
			System.out.print("Please enter your name: ");
			String playerName = input.next();
			
			Game game = new Game(playerName);
			
			System.out.println("\nSelect your difficulty level: ");
			System.out.println("Enter 1 for Easy.");
			System.out.println("Enter 2 for Hard.");
			
			int difficultyLevel = input.nextInt();
			
			if(difficultyLevel == 1) {
				game.beginEasy();
				break;
			}
			else if (difficultyLevel == 2) {
				game.beginHard();
				break;
			}
			else {
				System.out.println("Invalid Input.\nTry Again.\n");
				difficultyLevel = input.nextInt();
			}
			
			
		}
		else if (Option == 2) {
			GameRules Rules = new GameRules();
			Rules.printRules();
			
			System.out.println("\nEnter 1 to go back to main menu: ");
			System.out.println("Enter any other number to Exit the game: ");
			Option = input.nextInt();
			
			if (Option == 1) {
				continue;
			}
			else {
				System.out.println("Goodbye!");
				System.exit(0);
			}
			
			break;
		}
		else if(Option == 3){
			
			System.out.println("Goodbye!");
			System.exit(0);
			
		}
		else {
			System.out.println("Invalid Input.\nTry Again.\n");
			Option = input.nextInt();
		}
	} while (true); 
			
		
		input.close();
	
	}

}

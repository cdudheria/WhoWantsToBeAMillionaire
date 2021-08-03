

/**
 * 
 */

/**
  File Name: GameRules.java
     Author: chiragdudheria
       Date: Apr. 14, 202111:59:24 p.m.
 Description: Game Rules.
 */
public class GameRules {

	public GameRules() {
		super();
		
	}
	
	public void printRules() {
		

		System.out.println("Welcome to Who Wants To Be A Millionaire");
		System.out.println("Game Rules:");
		System.out.println("There are two difficulty options. Easy and Hard. \n"
				+ "The players that select the Easy difficulty option will be asked up to a maximum of 9 questions on any topics at varying difficulties.\n"
				+ "Whereas, the Players that choose the Hard difficulty option will be asked up a maximum of 15 questions on any topics.");
		System.out.println("Players must choose the most correct answer choice of the four (4) possible answer choices provided.\n" + 
				"");
		System.out.println("Both difficulty options must be played in three distinct rounds");
		
		System.out.println("Easy: Rules");
		System.out.println("Round 1");
		System.out.println("In Round 1, the player will face up to three (3) questions of varying degrees of difficulty. Each question has a respective dollar value. "
				+ "These dollar values shall include the following: Question 1 is $100, Question 2 is $500 and Question 3 is $1,000.\n" + 
				"Upon correctly answering all questions in this round, a player can choose to walk away. If a player walks away at this round they will “walk away” with $1,000.00.\n" + 
				"");
		
		System.out.println("Round 2");
		System.out.println("If the player successfully completes Round 1 and they choose not to walk away they will move on to Round 2.\n" + 
				"In round 2 the player will face up to three (3) questions of varying degrees of difficulty. Each question has a respective dollar value. These dollar values shall include the following amounts: Question 4 is $8,000, Question 5 is $16,000 and Question 6 is $32,000.\n" + 
				"Once the player correctly answers question 6, they can choose to “walk away” or move on to Round 3. If the player “walks away” they will walk away with $32,000.\n" + 
				"");
		
		System.out.println("Round 3");
		System.out.println("If the player successfully completes Round 2 and they choose not to walk away they will move on to Round 3.\n" + 
				"In Round 3, the player will face up to three (3) questions of varying degrees of difficulty.\n" + 
				"Each question has a respective dollar value. These dollar values shall include the following amounts:  Question 7 is $125,000, Question 8 is $500,000 and Question is 9 is $1,000,000.\n" + 
				"The player cannot walk away at this round however, once they complete this round they will win the game and walk away with 1 million dollars.\n" + 
				"");
		
		System.out.println("Hard: Rules");
		System.out.println("Round 1");
		System.out.println("In Round 1, the player will face up to five (5) questions of varying degrees of difficulty. Each question has a respective dollar value. These dollar values shall include the following: Question 1 is $100, Question 2 is $200, Question 3 is $300, Question 4 is 500 and Question 5 is $1,000.\n" + 
				"Upon correctly answering all questions in this round, a player can choose to walk away after correctly answering Question5 which is the $1,000 question. If a player walks away at this level they will “walk away” with $1,000.00\n" + 
				"");
		
		System.out.println("Round 2");
		System.out.println("If the player successfully completes Round 1 and they choose not to walk away they will move on to Round 2.\n" + 
				"In round 2 the player will face up to five (5) questions of varying degrees of difficulty. Each question has a respective dollar value. These dollar values shall include the following amounts: Question 6 is $2,000, Question 7 is $4,000, Question 8 is $8,000, Question 9 is $16,000 and Question 10 is $32,000.\n" + 
				"Once the player correctly answers question 10, they can choose to “walk away” or move on to Round 3. If the player “walks away” after correctly answering question 10 then the will walk away with $32,000.\n" + 
				"");
		
		System.out.println("Round 3");
		System.out.println("If the player successfully completes Round 2 and they choose not to walk away they will move on to Round 3." + 
				"In Round 3, the player will face up to five (5) questions of varying degrees of difficulty.\n" + 
				"Each question has a respective dollar value. These dollar values shall include the following amounts:  Question 11 is $64,000, Question 12 is $125,000, Question 13 is $250,000, Question 14 is $500,000 and Question is 15 is $1,000,000.\n" + 
				"The player cannot walk away at this round however, once they complete this round they will win the game and walk away with 1 million dollars.\n" + 
				"");
		
		System.out.println("Please note, for both difficulty options, players are allowed 3 lifelines which are:\n" + 
				"");
		System.out.println("1. 50/50- This lifeline allows the game to eliminate two incorrect answers.");
		System.out.println("2. Ask the Audience- This lifeline allows the player to “ask the audience” for the correct answer.");
		System.out.println("3. Phone a friend - This lifeline allows the player to “phone to a friend” for the correct answer. Be creative with regards to how you implement this.\n" + 
				"");
		
		System.out.println("You can only use each Life Line ONCE\n" + 
				"");
		
		System.out.println("The lifelines are only available in round 2 and round 3 for players who chose the hard option, whereas all lifelines are available from round 1 to players who chose the easy option.\n" + 
				"");
		
	
	}

}

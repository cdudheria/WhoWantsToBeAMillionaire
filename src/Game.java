import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

/**
 * 
 */

/**
  File Name: Game.java
     Author: chiragdudheria
       Date: Apr. 16, 20211:39:17 p.m.
 Description: Game functionality.
 */
public class Game {
	
	
	
	private String playerName;

	public Game(String playerName) {
		super();
		this.playerName = playerName;
	}


	public Game() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	Scanner input = new Scanner(System.in);
	
	boolean[] lifeLine = {false,false,false};
	
	public int askForLifeline() {
		
		if (lifeLine[0] && lifeLine[1] && lifeLine[2]) {
			System.out.println("\nYou have used all of your lifelines.");
			return -1;
		}
		
		System.out.println("\nDo you want to use a Lifeline (y/n):");
		char lifeLineOption = input.next().charAt(0);
		
		if(lifeLineOption == 'y' || lifeLineOption == 'Y') {
			int selectLifeLine;
			do {

				System.out.println("Enter the desired option:");
				System.out.println("1. 50/50 ");
				System.out.println("2. Audience poll ");
				System.out.println("3. Phone a Friend ");
				
				selectLifeLine = input.nextInt();
				if (lifeLine[selectLifeLine - 1]) {
					System.out.println("You have already used this lifeline. Select a different one.");
				}
					
			} while (lifeLine[selectLifeLine - 1]);
			
			return selectLifeLine;
		}
		else{
			return -1;
		}
    }

    public void useAudiencePoll(Question question) {
        // print the poll result 
    	System.out.println("Audience suggests Option " + question.getCorrectAnswer());
    	lifeLine[1] = true;
    }

    public void usePhoneAFriend(Question question) {
        // return some answer
    	System.out.println("Your friend suggests Option " + question.getCorrectAnswer());
    	lifeLine[2] = true;
    }

    public void useFiftyFifty(Question question) {
        // remove two options. 
    	int correctAnswer = question.getCorrectAnswer();
    	question.removeAnswers((correctAnswer % 4), ((correctAnswer + 1) % 4));
    	question.printAnswers();
    	lifeLine[0] = true;
    }
	
	
	public void beginEasy() {
		
		
		
		Integer [] prize =  new Integer [] {100,500,1000,8000,16000,32000,125000,500000,1000000};
		
		Random random = new Random();
		Set <Integer> Set = new LinkedHashSet<Integer>();
		
		while (Set.size() < 9 ) {
			Set.add(random.nextInt(25));
		}
		
		int Size = Set.size();
		
		int [] Result = new int[Size];
		
		Integer[] temp = Set.toArray (new Integer[Size]);
		for(int i = 0; i < Size; i++) {
			Result[i] = temp [i];
		}
		
		
		
		// the game starts here. 
		// take an array here with random permutation and traverse it for each round
		
		
//		Generate the question bank here with 9 questions:
		QuestionBank questionBank = new QuestionBank();
		
		ArrayList <Question> questions = new ArrayList <Question>();
		
		questions = questionBank.getQuestions();
		
		System.out.println("\nFirst round begins: \n");
		
//		round 1 begins here
		for (int i=0; i<3; i++) {
			
	
			int qNumber = i + 1; 
			
			System.out.println("Here is question number " + qNumber  );
			System.out.println("");
			
//			ask the question and take the answer and confirm the answer
//			print the question
			questions.get(temp[i]).printQuestion();
			
//			print the options 
			questions.get(temp[i]).printAnswers();
			
//			input the answer by the user
			char confirm;
			int selectedAnswer;
			
			do {
				
//				ask if the user wants to use a lifeline. 
				
				int useLifeLine = askForLifeline();
				
				if (useLifeLine == 1) {
					useFiftyFifty(questions.get(temp[i]));
				}
				else if (useLifeLine == 2) {
					useAudiencePoll(questions.get(temp[i]));
				}
				else if(useLifeLine == 3) {
					usePhoneAFriend(questions.get(temp[i]));
				}

				
				System.out.println("\nPlease enter your answer: ");
				selectedAnswer = input.nextInt();
				System.out.println("Are you sure ? (y/n)");
				confirm = input.next().charAt(0);
				
			} while (confirm!='y');
			
			
			
//			check the answer
			if (selectedAnswer == questions.get(temp[i]).getCorrectAnswer()) {
				System.out.println("Congrats. This is the correct answer. You won $" + prize[i] + ". Moving on to the next question");
				continue;
			}
			else {
				
//				if the answer is incorrect, just say goodbye, you have 0 dollars and exit. 
				
				System.out.println("That is the incorrect answer");
				System.out.println("You have won 0 Dollars.");
				System.exit(0);
			}
			
			
			
			
		}
		
		
//		ask if the player wants to walk away
//		if yes the you have won 1000 dollars and exit the program 
//		else round 2 begins
		
		System.out.println("Congratulations! First round is completed. If you want to walk away enter 'y' or If you "
				+ "want to continue to the second round enter 'n'.");
		char option = input.next().charAt(0);
		if (option == 'y' || option == 'Y') {
			System.out.println("Thank you for playing, " + this.playerName + ". You won $1000.");
			System.exit(0);
		}
		
//		System.exit(0);

// Round 2 begins here		
		System.out.println("\nThe Second round begins: ");
		
		for (int i=3; i<6; i++) {
			
			int qNumber = i + 1; 
			
			System.out.println("Here is question number " + qNumber );
			System.out.println("");
			
//			ask the question and take the answer and confirm the answer
//			print the question
			questions.get(temp [i]).printQuestion();
			
//			print the options 
			questions.get(temp [i]).printAnswers();
			
//			input the answer by the user
			char confirm;
			int selectedAnswer;
			
			do {
				
//				ask if the user wants to use a lifeline. 
				
				int useLifeLine = askForLifeline();
				
				if (useLifeLine == 1) {
					useFiftyFifty(questions.get(temp[i]));
				}
				else if (useLifeLine == 2) {
					useAudiencePoll(questions.get(temp[i]));
				}
				else if(useLifeLine == 3) {
					usePhoneAFriend(questions.get(temp[i]));
				}

				
				System.out.println("\nPlease enter your answer: ");
				selectedAnswer = input.nextInt();
				System.out.println("Are you sure ? (y/n)");
				confirm = input.next().charAt(0);
				
			} while (confirm!='y');
			
			
			
//			check the answer
			if (selectedAnswer == questions.get(temp [i]).getCorrectAnswer()) {
				System.out.println("Congrats. This is the correct answer. You won $" + prize[i] + ". Moving on to the next question");
				continue;
			}
			else {
				
//				if the answer is incorrect, just say goodbye, you have 0 dollars and exit. 
				
				System.out.println("That is the incorrect answer");
				System.out.println("You have won 0 Dollars.");
				System.exit(0);
			}
			
		
			
		}
		
		
//		ask if the player wants to walk away
//		if yes the you have won 32000 dollars and exit the program 
//		else round 3 begins 
		
		System.out.println("Congratulations! Second round is completed. If you want to walk away enter 'y' or If you "
				+ "want to continue to the third round enter 'n'.");
		
			option = input.next().charAt(0);
		if (option == 'y' || option == 'Y') {
			System.out.println("Thank you for playing, " + this.playerName +" You won $32000 .");
			System.exit(0);
		}
		
		//Third round Begins
		

		System.out.println("\nThird round begins: ");
		
		
		for (int i=6; i<9; i++) {
			
			int qNumber = i + 1; 
			
			System.out.println("Here is question number " + qNumber );
			System.out.println("");
			
//			ask the question and take the answer and confirm the answer
//			print the question
			questions.get(temp [i]).printQuestion();
			
//			print the options 
			questions.get(temp [i]).printAnswers();
			
//			input the answer by the user
			char confirm;
			int selectedAnswer;
			
			do {
				
//				ask if the user wants to use a lifeline. 
				
				int useLifeLine = askForLifeline();
				
				if (useLifeLine == 1) {
					useFiftyFifty(questions.get(temp[i]));
				}
				else if (useLifeLine == 2) {
					useAudiencePoll(questions.get(temp[i]));
				}
				else if(useLifeLine == 3) {
					usePhoneAFriend(questions.get(temp[i]));
				}
				
				System.out.println("\nPlease enter your answer: ");
				selectedAnswer = input.nextInt();
				System.out.println("Are you sure ? (y/n)");
				confirm = input.next().charAt(0);
				
			} while (confirm!='y');
			
			
			
//			check the answer
			if (selectedAnswer == questions.get(temp [i]).getCorrectAnswer()) {
				if (i == 8) {
					break;
				}
				System.out.println("Congrats. This is the correct answer. You won $" + prize[i] + ". Moving on to the next question");
				continue;
			}
			else {
				
//				if the answer is incorrect, just say goodbye, you have 0 dollars and exit. 
				
				System.out.println("That is the incorrect answer");
				System.out.println("You have won 0 Dollars.");
				System.exit(0);
			}
			
			
		}
		System.out.println("Congratulations! "+ this.playerName + ". You won $1,000,000.");
		System.exit(0);
		
//		no walk away option now as the player has won a million dollars 
//		just exit the program
		
	}
	
	//Hard game
	
public void beginHard() {
		
		Integer [] prize =  new Integer [] {100,200,300,500,1000,2000,4000,8000,16000,32000,64000,125000,250000,500000,1000000};
		
		Random random = new Random();
		Set <Integer> Set = new LinkedHashSet<Integer>();
		
		while (Set.size() < 15 ) {
			Set.add(random.nextInt(25));
		}
		
		int Size = Set.size();
		
		int [] Result = new int[Size];
		
		Integer[] temp = Set.toArray (new Integer[Size]);
		for(int i = 0; i < Size; i++) {
			Result[i] = temp [i];
		}
		
		
		
		// the game starts here. 
		// take an array here with random permutation and traverse it for each round
		
		
//		Generate the question bank here with 15 questions:
		QuestionBank questionBank = new QuestionBank();
		
		ArrayList <Question> questions = new ArrayList <Question>();
		
		questions = questionBank.getQuestions();
		
		System.out.println("\nFirst round begins: ");
		
//		round 1 begins here
		for (int i=0; i<5; i++) {
			
	
			int qNumber = i + 1; 
			
			System.out.println("Here is question number " + qNumber  );
			System.out.println("");
			
//			ask the question and take the answer and confirm the answer
//			print the question
			questions.get(temp[i]).printQuestion();
			
//			print the options 
			questions.get(temp[i]).printAnswers();
			
//			input the answer by the user
			char confirm;
			int selectedAnswer;
			
			do {
				
				System.out.println("\nPlease enter your answer: ");
				selectedAnswer = input.nextInt();
				System.out.println("Are you sure ? (y/n)");
				confirm = input.next().charAt(0);
				
			} while (confirm!='y');
			
			
			
//			check the answer
			if (selectedAnswer == questions.get(temp[i]).getCorrectAnswer()) {
				System.out.println("Congrats. This is the correct answer. You won $" + prize[i] + ". Moving on to the next question");
				continue;
			}
			else {
				
//				if the answer is incorrect, just say goodbye, you have 0 dollars and exit. 
				
				System.out.println("That is the incorrect answer");
				System.out.println("You have won 0 Dollars.");
				System.exit(0);
			}
			
			
			
			
		}
		
		
//		ask if the player wants to walk away
//		if yes the you have won 1000 dollars and exit the program 
//		else round 2 begins
		
		System.out.println("Congratulations! First round is completed. If you want to walk away enter 'y' or If you "
				+ "want to continue to the second round enter 'n'.");
		char option = input.next().charAt(0);
		if (option == 'y' || option == 'Y') {
			System.out.println("Thank you for playing, " + this.playerName + ". You won $1000.");
			System.exit(0);
		}
		


// Round 2 begins here		
		System.out.println("\nThe Second round begins: ");
		
		for (int i=5; i<10; i++) {
			
			int qNumber = i + 1; 
			
			System.out.println("Here is question number " + qNumber );
			System.out.println("");
			
//			ask the question and take the answer and confirm the answer
//			print the question
			questions.get(temp [i]).printQuestion();
			
//			print the options 
			questions.get(temp [i]).printAnswers();
			
//			input the answer by the user
			char confirm;
			int selectedAnswer;
			
			do {
				
//				ask if the user wants to use a lifeline. 
				
				int useLifeLine = askForLifeline();
				
				if (useLifeLine == 1) {
					useFiftyFifty(questions.get(temp[i]));
				}
				else if (useLifeLine == 2) {
					useAudiencePoll(questions.get(temp[i]));
				}
				else if(useLifeLine == 3) {
					usePhoneAFriend(questions.get(temp[i]));
				}
				
				System.out.println("\nPlease enter your answer: ");
				selectedAnswer = input.nextInt();
				System.out.println("Are you sure ? (y/n)");
				confirm = input.next().charAt(0);
				
			} while (confirm!='y');
			
			
			
//			check the answer
			if (selectedAnswer == questions.get(temp [i]).getCorrectAnswer()) {
				System.out.println("Congrats. This is the correct answer. You won $" + prize[i] + ". Moving on to the next question");
				continue;
			}
			else {
				
//				if the answer is incorrect, just say goodbye, you have 0 dollars and exit. 
				
				System.out.println("That is the incorrect answer");
				System.out.println("You have won 0 Dollars.");
				System.exit(0);
			}
			
		
			
		}
		
		
//		ask if the player wants to walk away
//		if yes the you have won 32000 dollars and exit the program 
//		else round 3 begins 
		
		System.out.println("Congratulations! Second round is completed. If you want to walk away enter 'y' or If you "
				+ "want to continue to the third round enter 'n'.");
		
			option = input.next().charAt(0);
		if (option == 'y' || option == 'Y') {
			System.out.println("Thank you for playing, "+ this.playerName + "You won $32000.");
			System.exit(0);
		}
		
		//Third round Begins
		

		System.out.println("\nThird round begins: ");
		
		
		for (int i=10; i<15; i++) {
			
			int qNumber = i + 1; 
			
			System.out.println("Here is question number " + qNumber );
			System.out.println("");
			
//			ask the question and take the answer and confirm the answer
//			print the question
			questions.get(temp [i]).printQuestion();
			
//			print the options 
			questions.get(temp [i]).printAnswers();
			
//			input the answer by the user
			char confirm;
			int selectedAnswer;
			
			do {
				
//				ask if the user wants to use a lifeline. 
				
				int useLifeLine = askForLifeline();
				
				if (useLifeLine == 1) {
					useFiftyFifty(questions.get(temp[i]));
				}
				else if (useLifeLine == 2) {
					useAudiencePoll(questions.get(temp[i]));
				}
				else if(useLifeLine == 3) {
					usePhoneAFriend(questions.get(temp[i]));
				}
				
				System.out.println("\nPlease enter your answer: ");
				selectedAnswer = input.nextInt();
				System.out.println("Are you sure ? (y/n)");
				confirm = input.next().charAt(0);
				
			} while (confirm!='y');
			
			
			
//			check the answer
			if (selectedAnswer == questions.get(temp [i]).getCorrectAnswer()) {
				if (i == 14) {
					break;
				}
				System.out.println("Congrats. This is the correct answer. You won $" + prize[i] + ". Moving on to the next question");
				continue;
			}
			else {
				
//				if the answer is incorrect, just say goodbye, you have 0 dollars and exit. 
				
				System.out.println("That is the incorrect answer");
				System.out.println("You have won 0 Dollars.");
				System.exit(0);
			}
			
			
		}
		System.out.println("Congratulations! "+ this.playerName + ". You won $1,000,000.");
		System.exit(0);
		
//		no walk away option now as the player has won a million dollars 
//		just exit the program
		
	}
 	
   
}

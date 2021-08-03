/**
 * 
 */

/**
  File Name: Question.java
     Author: chiragdudheria
       Date: Apr. 15, 202112:42:57 a.m.
 Description: Question class functionality.
 */
import java.util.ArrayList;

public class Question{
	
	private String question;
	private int correctAnswer;
	
	ArrayList <String> answers = new ArrayList <String>();

	public Question() {
		super();
	}

	public Question(String question, int correctAnswer, ArrayList<String> answers) {
		super();
		this.question = question;
		this.correctAnswer = correctAnswer;
		this.answers = answers;
	}
	
//	method to print the function 
	public void printQuestion() {
		//System.out.println("Here is the question :");
		System.out.println(this.question);
	}
	
	// method to print answers 
	public void printAnswers() {
		System.out.println("Below are the options: ");
		System.out.println("");
		
		for (int i=0; i<this.answers.size(); i++) {
			System.out.println(this.answers.get(i));
		}
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public int getCorrectAnswer() {
		return correctAnswer;
	}

	public void setCorrectAnswer(int correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

	public ArrayList<String> getAnswers() {
		return answers;
	}

	public void setAnswers(ArrayList<String> answers) {
		this.answers = answers;
	}

	public void removeAnswers(int incorrectAns1, int incorrectAns2) {
		this.answers.remove(incorrectAns1);
		this.answers.remove(incorrectAns2);
	}
	
	
	
	
	

}

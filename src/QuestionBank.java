import java.util.ArrayList;

/**
 * 
 */

/**
  File Name: QuestionBank.java
     Author: chiragdudheria
       Date: Apr. 16, 20211:59:01 p.m.
 Description:  Question Bank.
 */
public class QuestionBank {
	

	private ArrayList <Question> questions = new ArrayList <Question>();
	

	public ArrayList<Question> getQuestions() {
//		 create a question object 
//		create the answers for that 
//		add it to the list
		
		// the question
		String q1 = "In the UK, the abbreviation NHS stands for National what Service?";
		ArrayList <String> answers1 = new ArrayList <String>();
		answers1.add("1. Humanity");
		answers1.add("2. Honour");
		answers1.add("3. Health");
		answers1.add("4. Household");
		int correctAnswer1 = 3;
		Question question1 = new Question(q1, correctAnswer1, answers1);
		
		String q2 = "Which Disney character famously leaves a glass slipper behind at a royal ball?";
		ArrayList <String> answers2 = new ArrayList <String>();
		answers2.add("1. Pocahontas");
		answers2.add("2. Sleeping Beauty");
		answers2.add("3. Cinderella");
		answers2.add("4. Elsa");
		int correctAnswer2 = 3;
		Question question2 = new Question(q2, correctAnswer2, answers2);
		
		
		String q3 = "What name is given to the revolving belt machinery in an airport that delivers checked luggage from the plane to baggage reclaim?";
		ArrayList <String> answers3 = new ArrayList <String>();
		answers3.add("1. Hangar");
		answers3.add("2. Terminal");
		answers3.add("3. Concourse");
		answers3.add("4. Carousel");
		int correctAnswer3 = 4;
		Question question3 = new Question(q3, correctAnswer3, answers3);
		
		String q4 = "Which of these brands was chiefly associated with the manufacture of household locks?";
		ArrayList <String> answers4 = new ArrayList <String>();
		answers4.add("1. Phillips");
		answers4.add("2. Flymo");
		answers4.add("3. Chubb");
		answers4.add("4. Ronseal");
		int correctAnswer4 = 3;
		Question question4 = new Question(q4, correctAnswer4, answers4);
		
		String q5 = "The hammer and sickle is one of the most recognisable symbols of which political ideology?";
		ArrayList <String> answers5 = new ArrayList <String>();
		answers5.add("1. Republicanism");
		answers5.add("2. Liberalism");
		answers5.add("3. Conservatism");
		answers5.add("4. Communism");
		int correctAnswer5 = 4;
		Question question5 = new Question(q5, correctAnswer5, answers5);
		
		String q6 = "Which toys have been marketed with the phrase “robots in disguise”?";
		ArrayList <String> answers6 = new ArrayList <String>();
		answers6.add("1. Bratz Dolls");
		answers6.add("2. Sylvanian Families");
		answers6.add("3. Hatchimals");
		answers6.add("4. Transformers");
		int correctAnswer6 = 4;
		Question question6 = new Question(q6, correctAnswer6, answers6);
		
		String q7 = "What does the word loquacious mean?";
		ArrayList <String> answers7 = new ArrayList <String>();
		answers7.add("1. Chatty");
		answers7.add("2. Angry");
		answers7.add("3. Beautiful");
		answers7.add("4. Shy");
		int correctAnswer7 = 1;
		Question question7 = new Question(q7, correctAnswer7, answers7);
		
		String q8 = "Obstetrics is a branch of medicine particularly concerned with what?";
		ArrayList <String> answers8 = new ArrayList <String>();
		answers8.add("1. Childbirth");
		answers8.add("2. Broken bones");
		answers8.add("3. Concourse");
		answers8.add("4. Heart conditions");
		int correctAnswer8 = 1;
		Question question8 = new Question(q8, correctAnswer8, answers8);
		
		String q9 = "In Doctor Who, what was the signature look of the fourth Doctor, as portrayed by Tom Baker?";
		ArrayList <String> answers9 = new ArrayList <String>();
		answers9.add("1. Wide-brimmed hat and extra long scarf");
		answers9.add("2. Bow-tie, braces and tweed jacket");
		answers9.add("3. Pinstripe suit and trainers");
		answers9.add("4. Cape, velvet jacket and frilly shirt");
		int correctAnswer9 = 1;
		Question question9 = new Question(q9, correctAnswer9, answers9);
		
		String q10 = "Which of these religious observances lasts for the shortest period of time during the calendar year?";
		ArrayList <String> answers10 = new ArrayList <String>();
		answers10.add("1. Ramadan");
		answers10.add("2. Lent");
		answers10.add("3. Diwali");
		answers10.add("4. Hanukkah");
		int correctAnswer10 = 3;
		Question question10 = new Question(q10, correctAnswer10, answers10);
		
		String q11 = "At the closest point, which island group is only 50 miles south-east of the coast of Florida?";
		ArrayList <String> answers11 = new ArrayList <String>();
		answers11.add("1. Bahamas");
		answers11.add("2. US Virgin Islands");
		answers11.add("3. Turks and Caicos Islands");
		answers11.add("4. Bermuda");
		int correctAnswer11 = 1;
		Question question11 = new Question(q11, correctAnswer11, answers11);
		
		String q12 = "Construction of which of these famous landmarks was completed first?";
		ArrayList <String> answers12 = new ArrayList <String>();
		answers12.add("1. Empire State Building");
		answers12.add("2. Royal Albert Hall");
		answers12.add("3. Eiffel Tower");
		answers12.add("4. Big Ben Clock Tower");
		int correctAnswer12 = 4;
		Question question12 = new Question(q12, correctAnswer12, answers12);
		
		String q13 = "Which of these cetaceans is classified as a “toothed whale”?";
		ArrayList <String> answers13 = new ArrayList <String>();
		answers13.add("1. Gray whale");
		answers13.add("2. Minke whale");
		answers13.add("3. Sperm whale");
		answers13.add("4. Humpback whale");
		int correctAnswer13 = 3;
		Question question13 = new Question(q13, correctAnswer13, answers13);
		
		String q14 = "Who is the only British politician to have held all four “Great Offices of State” at some point during their career?";
		ArrayList <String> answers14 = new ArrayList <String>();
		answers14.add("1. David Lloyd George");
		answers14.add("2. Harold Wilson");
		answers14.add("3. James Callaghan");
		answers14.add("4. John Major");
		int correctAnswer14 = 3;
		Question question14 = new Question(q14, correctAnswer14, answers14);
		
		String q15 = "In 1718, which pirate died in battle off the coast of what is now North Carolina?";
		ArrayList <String> answers15 = new ArrayList <String>();
		answers15.add("1. Calico Jack");
		answers15.add("2. Captain Kidd");
		answers15.add("3. Bartholomew Roberts");
		answers15.add("4. Blackbeard");
		int correctAnswer15 = 4;
		Question question15 = new Question(q15, correctAnswer15, answers15);
		
		String q16 = "Which Sesame Street character is also known as The Grouch?";
		ArrayList <String> answers16 = new ArrayList <String>();
		answers16.add("1. Elmo");
		answers16.add("2. Big Bird");
		answers16.add("3. Oscar");
		answers16.add("4. Ernie");
		int correctAnswer16 = 3;
		Question question16 = new Question(q16, correctAnswer16, answers16);
		
		String q17 = "Which movie featured the touching romantic quote,You had me at hello.?";
		ArrayList <String> answers17 = new ArrayList <String>();
		answers17.add("1. Jerry Maguire");
		answers17.add("2. Down With Love");
		answers17.add("3. Must Love Dogs");
		answers17.add("4. The Graduate");
		int correctAnswer17 = 1;
		Question question17 = new Question(q17, correctAnswer17, answers17);
		
		String q18 = "What bodily organ produces the sticky liquid known as bile?";
		ArrayList <String> answers18 = new ArrayList <String>();
		answers18.add("1. Kidney");
		answers18.add("2. Gall Bladder");
		answers18.add("3. The Spinal Column");
		answers18.add("4. Liver");
		int correctAnswer18 = 4;
		Question question18 = new Question(q18, correctAnswer18, answers18);
		
		String q19 = "Which of the following is there more of on Earth?";
		ArrayList <String> answers19 = new ArrayList <String>();
		answers19.add("1. Sheep");
		answers19.add("2. Humans");
		answers19.add("3. Plankton");
		answers19.add("4. Cats");
		int correctAnswer19 = 3;
		Question question19 = new Question(q19, correctAnswer19, answers19);
		
		String q20 = "Which of the following fish is called Gadus?";
		ArrayList <String> answers20 = new ArrayList <String>();
		answers20.add("1. Shark");
		answers20.add("2. Anglerfish");
		answers20.add("3. Cod");
		answers20.add("4. Swordfish");
		int correctAnswer20 = 3;
		Question question20 = new Question(q20, correctAnswer20, answers20);
		
		String q21 = "Which of the following movies was not made in 1997?";
		ArrayList <String> answers21 = new ArrayList <String>();
		answers21.add("1. 12 Angry Men");
		answers21.add("2. Titanic");
		answers21.add("3. The Game");
		answers21.add("4. The X Files: Fight the Future");
		int correctAnswer21 = 4;
		Question question21 = new Question(q21, correctAnswer21, answers21);
		
		String q22 = "Which language (not including English) have student studies revealed to be the easiest to learn?";
		ArrayList <String> answers22 = new ArrayList <String>();
		answers22.add("1. Spanish");
		answers22.add("2. Italian");
		answers22.add("3. French");
		answers22.add("4. German");
		int correctAnswer22 = 1;
		Question question22 = new Question(q22, correctAnswer22, answers22);
		
		String q23 = "In the movie Wall Street, which famous actor played the character Gordon Gekko?";
		ArrayList <String> answers23 = new ArrayList <String>();
		answers23.add("1. Al Pacino");
		answers23.add("2. Kirk Douglas");
		answers23.add("3. Jack Nicholson");
		answers23.add("4. Michael Douglas");
		int correctAnswer23 = 4;
		Question question23 = new Question(q23, correctAnswer23, answers23);
		
		String q24 = "What nationality is tennis player Lleyton Hewitt?";
		ArrayList <String> answers24 = new ArrayList <String>();
		answers24.add("1. Australian");
		answers24.add("2. American");
		answers24.add("3. English");
		answers24.add("4. Irish");
		int correctAnswer24 = 1;
		Question question24 = new Question(q24, correctAnswer24, answers24);
		
		String q25 = "Who is the patron saint of Spain?";
		ArrayList <String> answers25 = new ArrayList <String>();
		answers25.add("1. Saint James");
		answers25.add("2. Saint John");
		answers25.add("3. Saint Peter");
		answers25.add("4. Saint Percy");
		int correctAnswer25 = 1;
		Question question25 = new Question(q25, correctAnswer25, answers25);
		
		
		
		// add all the questions to the list and return it. 
		questions.add(question1);
		questions.add(question2);
		questions.add(question3);
		questions.add(question4);
		questions.add(question5);
		questions.add(question6);
		questions.add(question7);
		questions.add(question8);
		questions.add(question9);
		questions.add(question10);
		questions.add(question11);
		questions.add(question12);
		questions.add(question13);
		questions.add(question14);
		questions.add(question15);
		questions.add(question16);
		questions.add(question17);
		questions.add(question18);
		questions.add(question19);
		questions.add(question20);
		questions.add(question21);
		questions.add(question22);
		questions.add(question23);
		questions.add(question24);
		questions.add(question25);
		
		
		
		return questions;
	}

	public void setQuestions(ArrayList<Question> questions) {
		this.questions = questions;
	}


	public QuestionBank() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	// assume the order will be same as of now. 
	// only working on 3 questions currently
	
	

}

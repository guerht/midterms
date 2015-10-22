//Test.java
import java.util.Scanner;
public class Test {
	Scanner scan = new Scanner(System.in);
	private String[] questions = {
		"What is the capital city of Korea?",
		"What is 120 - 80?",
		"How many fingers does Simon possess? Write the answer in English",
		"What is black and liquid?",
		"Convert 1in. into centimetres."
	};
	private static String[] answers = {
		"Seoul",
		"40",
		"Ten",
		"coffee",
		"2.54cm"
	};
	private String[] answersUser = new String[5];
	private int score; // total score
	private double grade; // out of 100%
	private char letter;
	public void askQuestions() {
		for(int i = 0; i <= 4; i++ ) {
			System.out.println(questions[i]);
			answersUser[i] = scan.nextLine();
			if(answersUser[i].equals(answers[i])) {
				System.out.println("Your answer " + answersUser[i] + " is RIGHT!");
				score += 2;
			}
			/*else if (answersUser[0].equals("seoul") || answersUser[2].equals("ten") || answersUser[4].equals("2.54")) {
				System.out.println("Your answer " + answersUser[i] + " is kind of right...");
				score += 1;
			}*/
			else if(i == 0) {
				if(answersUser[0].equals("seoul")) {
					System.out.println("Your answer " + answersUser[i] + " is kind of right...");
					score += 1;
				}
				else {
					System.out.println("Your answer " + answersUser[i] + " is WRONG!");
				}
			}
			else if(i == 2) {
				if(answersUser[2].equals("ten") || answersUser[2].equals("Ten") || answersUser[2].equals("10")) {
					System.out.println("Your answer " + answersUser[i] + " is kind of right...");
					score += 1;
				}
				else {
					System.out.println("Your answer " + answersUser[i] + " is WRONG!");
				}
			}
			else if(i ==4) {
				if(answersUser[4].equals("2.54")) {
					System.out.println("Your answer " + answersUser[i] + " is kind of right...");
					score += 1;
				}
				else {
					System.out.println("Your answer " + answersUser[i] + " is WRONG!");
				}
			}
			else {
				System.out.println("Your answer " + answersUser[i] + " is WRONG!");
			}
		}
		System.out.println("You scored " + score + " out of 10");
	}
	public char calcGrade() {
		switch((int)grade) {
			case 100:
			case 90:
				letter = 'A';
				break;
			case 80:
				letter = 'B';
				break;
			case 70:
				letter = 'C';
				break;
			case 60:
				letter = 'D';
				break;
			case 50:
			case 40:
			case 30:
			case 20:
			case 10:
			case 0:
				letter = 'F';
				break;
			default:
				break;
		}
		return letter;
	}
	public void printGrade() {
		grade = score*10;
		System.out.println("Your percent score is: " + grade);
	}
}
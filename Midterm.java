/*
 * Project: Midterm.java
 * Description: Midterm programming section
 * Name: Seunghoon Park
 * Date: 19th October 2015
 */
 import java.util.Scanner;
/*
 * Begin the class here
 */
public class Midterm {
  /*
   * Begin the main method here
   */
  public static void main(String[] args){
    // STEP 1: Create a NEW 'Test' object in a NEW 'Test.java' file (details below)
    /*
     * Details about the TEST object
     * Feel free to CUT/COPY/PASTE these directions into your NEW file
     * 
     * Create (construct) a new Test object that will:
     *     1) ask the User some (simple) questions (like "what color is the sky?")
     *     2) check their answers
     *     3) print out a grade based on their passing percent
     * 
     * All variables should be PRIVATE
     * variables: 1. String array questions[]   => that holds 2+ questions for your "Test"
     *            2. String array answers[]     => that hold the RIGHT answers for your "Test"
     *            3. String array answersUser[] => that WILL hold 2+ answers for your "Test" (tell it how many items to store)
     *            4. int score                  => that holds the total number of correct answers
     *            5. double grade               => that holds the User's grade percentage
     * 
     * All methods should be PUBLIC
     * methods:   1. askQuestions( Scanner ) that will:
     *                a) accept a Scanner object from the main program
     *                b) loop through the questions (use a FOR loop)
     *                c) ask them to the user
     *                d) read in user input
     *                e) store the user input in the answers[] array
     *                f) IMMEDIATELY calls a static chkAnswer() method to see if you are right or wrong
     * 
     *            2. static chkAnswer( String, int ) that will: 
     *                a) receive the String from the user input + the i value for the array index
     *                b) compares the String with answers[int] (use IF/ELSE)
     *                    i)   IF correct (the same), print "Your answer is RIGHT!"
     *                    ii)  ELSE IF correct but the wrong case print "Your answer is kind of right..."
     *                    iii) ELSE (incorrect), print "Your answer is WRONG!"
     * 
     *            3. chkAnswers() that will:
     *                a) loop through the answersUser[] array (use a WHILE loop)
     *                b) compares each answersUser[] with answers[] (use IF/ELSE)
     *                    i)   IF correct (the same), add 2 POINTS to their score
     *                    ii)  ELSE IF correct but the wrong case (upper/lower), add 1 POINT to their score
     *                    iii) ELSE (incorrect), SUBTRACT 1 point from their score
     * 
     *            3. char calcGrade() that will:
     *                a) set grade to the score / questions * 2 (also make it a percent *100)
     *                b) print their grade as a percent out of 100
     *                c) RETURN a char value with the letter of their grade
     * 
     *            4. printGrade( char ) that will:
     *                a) accept a Letter grade 
     *                b) use a SWITCH statement to print a comment based on the Letter grade
     */

    
    // STEP 2: Initialize your Test() object here
    Test test = new Test();
	Scanner confirm = new Scanner(System.in);
	String character;
    
    // STEP 3: askQuestions() here
	do {
		test.askQuestions();
		test.printGrade();
		System.out.println("Your letter grade is: " + test.calcGrade() + ".");
		System.out.println("Try the test again? (y,n)");
		character = confirm.nextLine();
    } while (character.equals("y") || character.equals("Y"));
    // STEP 4: chkAnswers() here
    //***.chkAnswers();
    
    // STEP 6: Print the grade here
    //***.printGrade( ***.calcGrade() );
    
  } // END main method
  
} // END class

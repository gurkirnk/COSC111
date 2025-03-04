// Gurkirn K

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String[][] provincesAndCapitals = {
		{"Alberta", "Edmonton"},
		{"British Columbia", "Victoria"},
		{"Manitoba", "Winnipeg"},
		{"New Brunswick", "Fredericton"},
		{"Newfoundland and Labrador", "St. John's"},
		{"Nova Scotia", "Halifax"},
		{"Ontario", "Toronto"},
		{"Prince Edward Island", "Charlottetown"},
		{"Quebec", "Montreal"},
		{"Saskatchewan", "Regina"}
	};
	
	Scanner input = new Scanner(System.in);
	int correctAnswers = 0;
	for(String[] provinceAndCapital : provincesAndCapitals) {
		String province = provinceAndCapital[0];
		String correctCapital = provinceAndCapital[1];
		
		System.out.println("What is the capital of " + province + "?");
		String userAnswer = input.nextLine().trim();
		
		if (userAnswer.equalsIgnoreCase(correctCapital)) {
			System.out.println("Correct!");
			correctAnswers++;
		} else {
			System.out.println("Wrong.");
		}
	}
	
	System.out.println("You got " + correctAnswers + " questions(s) right.");
	input.close();

 }
}
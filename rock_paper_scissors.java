// Gurkirn Kaur
// program stimulating rock, paper, scissors 

import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner input = new Scanner(System.in);
	
	int computerChoice = (int) (Math.random() * 3);
	
	System.out.print("scissors (0), rock (1), paper (2): ");
	int number = input.nextInt();
	
	input.close();
	
	if (number == computerChoice) {
        System.out.println("The computer is " + computerChoice + " You are " + number + " It's a draw!");
    } else if ((number == 0 && computerChoice == 2) ||  
               (number == 1 && computerChoice == 0) || 
               (number == 2 && computerChoice == 1)) { 
        System.out.println("The computer is " + computerChoice + " You are " + number + " You Win!");
    } else {
        System.out.println("The computer is " + computerChoice + " You are " + number + " You Lose!");
    }
}


public static String choiceToString(int choice) {
    switch (choice) {
        case 0: return "Scissor";
        case 1: return "Rock";
        case 2: return "Paper";
        default: return "Invalid choice";
    }
	
	
	}

}

// Gurkirn Kaur, 64953318
// This program simulates a dice game called Craps where rolling on a certain sum of numbers can cause you to either win or lose

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dice1 = (int) (Math.random() * 6) + 1;
		int dice2 = (int) (Math.random() * 6) + 1;
		int sum = dice1 + dice2;
		
		System.out.println("You rolled a " + sum);
		
		if (sum == 7 || sum == 11) {
			System.out.println("You win!");
			return;
		} else if (sum == 2 || sum == 3 || sum == 12) {
			System.out.println("You lose.");
			return;	
		}
		
		int point = sum;
		System.out.println("Point is " + point);
		
		while (true) {
			dice1 = (int) (Math.random() * 6) + 1;
			dice2 = (int) (Math.random() * 6) + 1;
			sum = dice1 + dice2;
			System.out.println("You rolled a " + sum);
			
			if (sum == point) {
				System.out.println("You win!");
				break;
			} else if (sum == 7) {
				System.out.println("Craps. You lose.");
				break;
			}
		}
		
	}
}

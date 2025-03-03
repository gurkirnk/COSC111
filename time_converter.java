// Gurkirn Kaur 

import java.util.Scanner;
public class Q1 {
		
		public static String convertTime(int totalSeconds) {
			int hours = totalSeconds / 3600;
	        int minutes = (totalSeconds % 3600) / 60;
	        int seconds = totalSeconds % 60;
	
	        
	        return String.format("%02d:%02d:%02d", hours, minutes, seconds); 
		}

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter time in seconds: ");
    int totalSeconds = input.nextInt();

    String formattedTime = convertTime(totalSeconds);
    System.out.println("The time is " + formattedTime);
	
	input.close();
	

	}

}

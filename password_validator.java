// Gurkirn K
// this program takes a user inputed password and checks if the password is valid using the criteria given

import java.util.Scanner;
public class password_validator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String password;
		
		while (true) {
			System.out.print("Password: ");
			password = input.nextLine();
			
			if (isValid(password)) {
				System.out.println("Password is valid.");
				break;
			}
		
		}
		input.close();
	}
	
	
	public static boolean isValid(String s) {
		
		if (s.length() < 8) {
			System.out.println("Password length must be greater than 8 characters");
			return false;
		}
		if (countUpperCase(s) < 2) {
			System.out.println("Password must contain at least 2 uppercase characters");
			return false;
		}
		if (countLowerCase(s) < 2) {
			System.out.println("Password must contain at least 2 lowercase characters");
			return false;
		}
		if (containsWhiteSpace(s)) {
			System.out.println("Password cannot contain white space characters");
			return false;
		}
		if (!hasSpecialChar(s)) {
			System.out.println("Password must contain a special character");
			return false;
		}
		if (!hasDigit(s)) {
			System.out.println("Password must contain at least one digit");
			return false;
		}
		if (containsPassword(s)) {
			System.out.println("Password cannot contain the word 'password'");
			return false;
		}
		return true;
	}
	
	
	public static int countUpperCase(String s) {
		int count = 0;
		for (char c : s.toCharArray()) {
			if (Character.isUpperCase(c)) {
				count++;
			}
		}
		return count;
	}
	
	
	public static int countLowerCase(String s) {
		int count = 0;
		for (char c : s.toCharArray()) {
			if (Character.isLowerCase(c)) {
				count++;
			}
		}
		return count;
	}
	
	
	public static boolean containsWhiteSpace(String s) {
		for (char c : s.toCharArray()) {
			if (Character.isWhitespace(c)) {
				return true;
			}
		}
		return false;
	}
	
	
	public static boolean hasSpecialChar(String s) {
		for (char c : s.toCharArray()) {
			if (!Character.isLetterOrDigit(c)) {
				return true;
			}
		}
		return false;
	}
	
	
	public static boolean hasDigit(String s) {
		for (char c : s.toCharArray()) {
			if (Character.isDigit(c)) {
				return true;
			}
		}
		return false;
	}
	
	
	public static boolean containsPassword(String s) {
		String lower = s.toLowerCase();
		return lower.contains("password") || lower.contains("drowssap");
	}
}

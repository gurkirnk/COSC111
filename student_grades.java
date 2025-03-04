// Gurkirn K

import java.util.Scanner;
import java.util.Arrays;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Enter number of students: ";
        String s2 = "Enter student grades: ";

        double[] grades = getNumsFromUser(s1, s2);

        showLetterGrades(grades);
    }
	
	public static double[] getNumsFromUser(String msg1, String msg2) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(msg1);
        int numElements = scanner.nextInt();
        double[] numbers = new double[numElements];

        System.out.println(msg2);
        for (int i = 0; i < numElements; i++) {
            System.out.print("Grade " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }
        
        scanner.close();
        return numbers;
    }

    public static void showLetterGrades(double[] grades) {
        if (grades.length == 0) {
            System.out.println("No grades to process.");
            return;
        }

        double highestGrade = Arrays.stream(grades).max().getAsDouble();

        System.out.println("\nStudent Grades and Letter Grades:");
        for (double grade : grades) {
            String letterGrade;
            double diff = highestGrade - grade;

            if (diff <= 10) {
                letterGrade = "A";
            } else if (diff <= 20) {
                letterGrade = "B";
            } else if (diff <= 30) {
                letterGrade = "C";
            } else if (diff <= 40) {
                letterGrade = "D";
            } else {
                letterGrade = "F";
            }
            System.out.printf("Student score is %.2f and grade is %s%n", grade, letterGrade);

	}

}}

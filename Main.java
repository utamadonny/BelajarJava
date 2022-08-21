import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello World! tes main class");
		int StudentAge = 10;
		double StudentHeight = 1.75;
		char StudentGrade = 'A';
		boolean StudentIsMale = true;
		String StudentName = "John";
		char StudentFirstInitial = StudentName.charAt(0);
		System.out.println(StudentName + " " + StudentFirstInitial + " " + StudentAge + " " + StudentHeight + " " + StudentGrade + " " + StudentIsMale);
		System.out.println(StudentFirstInitial);
		System.out.println("Student Age: " + StudentAge);
		System.out.println("Student Height: " + StudentHeight);
		System.out.println("Student Grade: " + StudentGrade);
		System.out.println("Student IsMale: " + StudentIsMale);
		System.out.println("Student Name: " + StudentName);

		Scanner input = new Scanner(System.in);
		System.out.println("Enter new Height: ");
		StudentHeight = input.nextDouble();

		System.out.println(StudentName + " now has a height of " + StudentHeight);
	

	}
}
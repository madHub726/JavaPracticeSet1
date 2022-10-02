package gradMess;

import java.util.Scanner;

public class GradShow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Grade:  ");
		String grade = s.next();
		switch (grade) {
		case "A":
		case "B":
			System.out.println("Excellent");
			break;
		case "C":
		case "D":
			System.out.println("Good... But can be better");
			break;
		case "E":
			System.out.println("Focus man you are lagging behind");
			break;
		case "F":
			System.out.println("Better luck next time... Study hard");
			break;
		default:
			System.out.println("Entered character is not a grade");
		}
	}
}

package fahToCel;

import java.util.Scanner;

public class ConvertCel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter temperature in Fahrenheit: ");
		int fah = s.nextInt();
		int cel = (fah-32)*5/9;
		System.out.println(fah+"oF -> "+cel+" oC");
		s.close();
	}
}

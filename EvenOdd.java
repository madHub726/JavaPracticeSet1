package evenOdd;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = s.nextInt();
		if(num%2==0) System.out.println(num+" is a even number");
		else System.out.println(num+" is a odd number");
		s.close();
	}

}

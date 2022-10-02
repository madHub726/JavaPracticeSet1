package lar3Num;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the 3 numbers");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		if(a>b)
			if(a>c) System.out.println(a+" is the largest");
			else System.out.println(c+" is the largest");
		else if (b>c) System.out.println(b+" is the largest");
		else System.out.println(c+" is the largest");
		s.close();
	}

}

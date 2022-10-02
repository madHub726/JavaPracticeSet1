package checkPrime;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = s.nextInt();
		if(num==1||num==0) {
			System.out.println(num+" is a prime number");
			System.exit(0);
		}
		for(int i=2;i<(num/2);i++)
			if(num%i==0) {
				System.out.println(num+" is not a prime number");
				System.exit(0);
			}
		System.out.println(num+" is a prime number");
		s.close();
	}

}

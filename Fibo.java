package fibonacci;

import java.util.Scanner;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number of digits to print: ");
		int limit = s.nextInt();
		int prev=0;
		int prev2 = 0;
		int curr = 1;
		for(int i=0;i<=limit;i++) {
			System.out.print(curr+"  ");
			prev2 = prev;
			prev = curr;
			curr = prev+prev2;
		}
		s.close();
	}
}

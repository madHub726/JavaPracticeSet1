package factorial;

import java.util.Scanner;

public class Fact {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = s.nextInt();
		int res = 1;
		for(int i=1;i<=num;i++) res = res*i;
		System.out.println(num+"! = "+res);
		s.close();
	}
}

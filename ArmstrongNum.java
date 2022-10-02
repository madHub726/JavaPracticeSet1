package armstronNum;

import java.util.Scanner;

public class ArmstrongNum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = s.nextInt();
		int temp = num;
		int res=0;
		int dig = String.valueOf(num).length();
		while(temp>0) {
			res = res + (int) Math.pow((temp%10), dig);
			temp = temp/10;
		}
		if(res==num) System.out.println(num+" is a Armstrong number");
		else System.out.println(num+" is not a Armstrong number");
		
		s.close();
	}
}

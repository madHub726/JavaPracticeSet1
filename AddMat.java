package add2Matrices;

import java.util.Scanner;

public class AddMat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int[][] mat1, mat2, matAns;
		
		System.out.println("Enter the size of the matrices (row x col): ");
		int m = s.nextInt();
		int n = s.nextInt();
		mat1 = new int[m][n];
		mat2 = new int[m][n];
		matAns = new int[m][n];
		
		System.out.println("Enter the first matrix:");
		for(int i=0;i<m; i++)
			for(int j=0;j<n;j++)
				mat1[i][j] = s.nextInt();
		
		System.out.println("Enter the second matrix:");
		for(int i=0;i<m; i++)
			for(int j=0;j<n;j++)
				mat2[i][j] = s.nextInt();
		
		for(int i=0;i<m; i++)
			for(int j=0;j<n;j++)
				matAns[i][j] = mat1[i][j]+mat2[i][j];
		
		System.out.println("The addition of given matrices is: ");
		for(int i=0;i<m; i++) {
			for(int j=0;j<n;j++)
				System.out.print(matAns[i][j]+"  ");
			System.out.println();
		}
		s.close();
	}
}

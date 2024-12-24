package dec24;

import java.util.Scanner;

public class Matrix1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of rows");
		int r = sc.nextInt();
		System.out.println("enter no of columns");
		int c = sc.nextInt();
		
		
		int[][] matrix = new int[r][c];
		
		for(int rows=0;rows<r;rows++) {
			for(int cols=0;cols<c;cols++) {
				
				matrix[rows][cols]= sc.nextInt();
			}
			
		}
		// print
		for(int rows=0;rows<r;rows++) {
			for(int cols=0;cols<c;cols++) {
				
				System.out.print(matrix[rows][cols]+" ");
			
			}
			System.out.println();
			
		}
		
		
		
		
		
	}

}

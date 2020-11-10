package application;

import java.util.Scanner;

import entities.MatLearn;

public class MatLearnMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value for lines: ");
		int m = sc.nextInt();
		
		System.out.println("Enter value for columns: ");
		int n = sc.nextInt();
		
		//generates the matrix mat
		MatLearn matLearn = new MatLearn(m, n);
		
		System.out.println("---------------------");
		
		//populates the matrix. turn off commentaries and ++ to ask for entry instead
		//int k = 0;
		System.out.println("Enter values for the matrix");
		for (int i = 0; i < m; i++) {
			for ( int j = 0; j < n; j++) {
				int k = sc.nextInt();
				//k++;
				matLearn.setAtPosition(i, j, k);
			}
		}
		
		
		
		//search for element, return position
		System.out.println("Enter Number to Search: ");
		int searchMe = sc.nextInt();
		
		for (int i = 0; i < m; i++) {
			for ( int j = 0; j < n; j++) {
				if (matLearn.getMatrix()[i][j] == searchMe) {
					System.out.println(matLearn.getMatrix()[i][j] + " found at POS: (" + i + ", " + j + ")");
					
					//check for above, left, right, bottom
					
					if(i > 0 && i < matLearn.getMatrix().length) {
						System.out.println("Above: " + matLearn.getMatrix()[i-1][j]);
					}
					
					if (i > 0 && i < matLearn.getMatrix().length - 1) {
						System.out.println("Bottom: " + matLearn.getMatrix()[i+1][j]);	
					} else if (m > 0 && i < matLearn.getMatrix().length - 1) {
						System.out.println("Bottom: " + matLearn.getMatrix()[i+1][j]);
					}
					
					if(j > 0 && j < matLearn.getMatrix().length) {
						System.out.println("Left: " + matLearn.getMatrix()[i][j-1]);
					}
					
					if (j > 0 && j < matLearn.getMatrix().length - 1) {
						System.out.println("Right: " + matLearn.getMatrix()[i][j+1]);	
					}else if (n > 0 && j < matLearn.getMatrix().length - 1) {
						System.out.println("Right: " + matLearn.getMatrix()[i][j+1]);
					}
					
					
					
					
				}
			}
		}
		
		
		sc.close();
	
	}

}

package PracticalPractice;

import java.util.Scanner;

class Matrix{
	public static void main(String args[]){
		Scanner r = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int rows = r.nextInt();
		
		Scanner c = new Scanner(System.in);
		System.out.print("Enter number of columns : ");
		int columns = c.nextInt();
		
		int array1[][] = new int[rows][columns];
		int array2[][] = new int[rows][columns];
		int array3[][] = new int[rows][columns];
		int array4[][] = new int[rows][columns];
		
		Scanner elements1 = new Scanner(System.in);
		System.out.println("Enter elements of matrix 1: ");
		for(int i = 0;i < rows; i++){
			for(int j = 0;j < columns; j++){
				array1[i][j] = elements1.nextInt();
			}
		}
		
		Scanner elements2 = new Scanner(System.in);
		System.out.println("Enter elements of matrix 2 : ");
		for(int i = 0;i < rows; i++){
			for(int j = 0;j < columns; j++){
				array2[i][j] = elements2.nextInt();
			}
		}
		
		for(int i = 0;i < rows; i++){
			for(int j = 0;j < columns; j++){
				array3[i][j] = array1[i][j]+array2[i][j];
			}
		}
		
		System.out.println("Addition : ");
		for(int i = 0;i < rows; i++){
			for(int j = 0;j < columns; j++){
				System.out.print(array3[i][j] + " ");
			}
			System.out.println();
		}
		
		for(int i = 0;i < rows; i++){
			for(int j = 0;j < columns; j++){
				for(int k = 0;k < columns; k++){
					array4[i][k] += array1[i][k]*array2[k][j];
				}
				
			}
		}
		
		System.out.println("Multiplication : ");
		for(int i = 0;i < rows; i++){
			for(int j = 0;j < columns; j++){
				System.out.print(array4[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
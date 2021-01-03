package PracticalPractice;

import java.util.Scanner;

class Multiplication10{
	public static void main(String[] args){
		Scanner a = new Scanner(System.in);
		System.out.print("Enter the table number : ");
		int input = a.nextInt();
		
		for(int i = 1; i <= 10; i++){
			System.out.println(input+" * "+i+" = "+input*i);
		}
	}
}

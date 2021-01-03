package PracticalPractice;

import java.util.Scanner;

class StringReverse{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter string : ");
		String input = in.nextLine();
		
		char myArray[] = input.toCharArray();
		
		for(int i = myArray.length-1; i >= 0 ; i--){
			System.out.print(myArray[i]);
		}
	}
}
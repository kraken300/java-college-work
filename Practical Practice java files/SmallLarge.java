package PracticalPractice;

import java.util.Scanner;

class SmallLarge{
	public static void main(String[] args){
		
		Scanner size = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int n = size.nextInt();
		
		int[] array = new int[n];
		
		Scanner elements = new Scanner(System.in);
		System.out.println("Enter elements :" );
		for(int i = 0; i < n; i++){
			array[i] = elements.nextInt();
		}
		for(int a : array){
			System.out.print(a+" ");
		}
		System.out.println();
		int large = array[0];
		int small = array[0];
		
			for(int k = 1; k < n; k++){
				if(array[k] > large){
					large = array[k];
				}
				if(array[k] < small){
					small = array[k];
				}
				
			}
		System.out.print("Biggest Element :"+large);
		System.out.println();
		System.out.print("Smallest Element :"+small);
	}
}
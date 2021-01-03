package PracticalPractice;

import java.util.Scanner;

class AscDesc{
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
		//int large = array[0];
		//int small = array[0];
		int temp;
		
		for(int j = 0; j < n; j++){
			for(int k = j+1; k < n; k++){
				if(array[j] < array[k]){
					temp = array[j];
					array[j] = array[k];
					array[k] = temp;
				}
			}
			
		}
		
		System.out.println();
		for(int b : array){
			System.out.print(b+" ");
		}
		
		for(int j = 0; j <n; j++){
			for(int k = j+1; k < n; k++){
				if(array[j] > array[k]){
					temp = array[j];
					array[j] = array[k];
					array[k] = temp;
				}
			}
			
		}
		System.out.println();
		for(int c : array){
			System.out.print(c+" ");
		}
		
	}
}
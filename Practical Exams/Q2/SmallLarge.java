import java.util.Scanner;
class SmallLarge{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int n = input.nextInt();
		
		int array[] = new int[n];
		
		Scanner values = new Scanner(System.in);
		System.out.println("Enter values : ");
		for(int i = 0; i < n;i++){
			array[i] = values.nextInt();
		}
		
		int small = array[0];
		int large = array[0];
		
		for(int i = 0; i < n;i++){
			if(array[i] > large){
				large = array[i];
			}
			
			if(array[i] < small){
				small = array[i];
			}
		}
		System.out.print("Largest Value is :  "+large);
		System.out.println();
		System.out.print("Smallest Value is :  "+small);
	}
}
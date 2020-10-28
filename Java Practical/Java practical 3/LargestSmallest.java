import java.util.Scanner;
class LargestSmallest{
	int num,max,min;
	int[] myArray;
	
	void inputData(){
		Scanner size = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		num = size.nextInt();
		myArray = new int[num];
		
		Scanner element = new Scanner(System.in);
		System.out.println("Enter elements : ");
		for(int i = 0 ; i < num ; i++){
			myArray[i] = element.nextInt();
		}
	}
	
	void diplayData(){
		System.out.println("The elements are: ");
		for(int i = 0 ; i < num ; i++){
			System.out.println(myArray[i]);
		}
	}
	
	void minMax(){
		max = myArray[0];
		min = myArray[0];
		
		for(int x = 1; x < num ; x++){
			if(myArray[x] > max){
				max = myArray[x];
			}
			
			else if(myArray[x] < min){
				min = myArray[x];
			}	
		}
		System.out.println("The smallest element is : " + min);
		System.out.println("The largest element is : " + max);
	}
	
	public static void main(String[] args){
		LargestSmallest myNum = new LargestSmallest();
		myNum.inputData();
		myNum.diplayData();
		myNum.minMax();
	}
}
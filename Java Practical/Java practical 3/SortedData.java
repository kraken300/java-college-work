import java.util.Scanner;
class SortedData{
	int num,temp;
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
		System.out.print("The elements are: ");
		for(int i = 0 ; i < num ; i++){
			System.out.print(myArray[i] + " ");
		}
		System.out.println();
	}
	
	void ascending(){
		System.out.print("Ascending numbers are : ");
		for(int i = 0; i < num; i++){
			for(int j = i+1; j < num; j++){
				if(myArray[i] > (myArray[j])){
					temp = myArray[i];
					myArray[i] = myArray[j];
					myArray[j] = temp;
				}
			}
			System.out.print(myArray[i] + " ");
		}
		System.out.println();
	}
	
	void descending(){
		System.out.print("Descending numbers are : ");
		for(int i = 0; i < num; i++){
			for(int j = i+1; j < num; j++){
				if(myArray[i] < (myArray[j])){
					temp = myArray[i];
					myArray[i] = myArray[j];
					myArray[j] = temp;
				}
			}
			System.out.print(myArray[i] + " ");
			
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		SortedData data = new SortedData();
		data.inputData();
		data.diplayData();
		data.ascending();
		data.descending();
	}
}
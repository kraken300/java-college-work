import java.util.Scanner;
class SortData{
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
	
	void asce(){
		System.out.print("Ascending order : ");
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
	
	void desc(){
		System.out.print("Descending order : ");
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
		SortData data = new SortData();
		data.inputData();
		data.diplayData();
		data.asce();
		data.desc();
	}
}
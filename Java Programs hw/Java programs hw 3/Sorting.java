class Sorting{
	public static void main(String[] args){
		int temp;
		int[] numbers = {3,5,4,8,7,9,6,1,2,10};
		System.out.println("Array length : " + numbers.length);
		for(int i = 0; i < numbers.length; i++){
			for(int j = i+1; j < numbers.length ; j++){
				if (numbers[i]>numbers[j]){
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
			
		}
		System.out.println("Ascending order : ");
		for(int a : numbers){
			System.out.print(a+"\t");
		}
		System.out.println();
		
		for(int i = 0; i < numbers.length; i++){
			for(int j = i+1; j < numbers.length ; j++){
				if (numbers[i]<numbers[j]){
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
			
		}
		System.out.println("Decending order : ");
		for(int b : numbers){
			System.out.print(b+"\t");
		}
	}
}
	
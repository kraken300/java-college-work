class AlphabetStrings{
	public static void main(String[] args){
		String data[] = {"Diamond","Cat","Fighter","Apple","Pineapple"};
		String temp = null;
		
		System.out.println("Without Alphabetical Order : ");
		for(int z = 0; z < data.length; z++){
			System.out.println(data[z]+" ");
		}
		
		for(int i = 0; i < data.length; i++){
			for(int j = i+1; j < data.length; j++){
				if(data[j].compareTo(data[i]) < 0){
					temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
		System.out.println("With Alphabetical Order : ");
		for(int k = 0; k < data.length; k++){
			System.out.println(data[k]+" ");
		}
	}
}
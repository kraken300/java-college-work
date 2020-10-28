class AlphabetStrings{
	public static void main(String[] args){
		String data[] = {"Diamond","Cat","Fighter","Apple","Pokemon"};
		String temp = null;
		
		for(int i = 0; i < data.length; i++){
			for(int j = i+1; j < data.length; j++){
				if(data[j].compareTo(data[i]) < 0){
					temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
		
		for(int k = 0; k < data.length; k++){
			System.out.println(data[k]);
		}
	}
}
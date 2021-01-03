class Pattern{
	public static void main(String[] args){
		
		String[] myArray = {"A","B","C","D","E","F"};
		
		for(int i = 0; i <= 5 ;i++){
			
			for(int j = 4; j > i;j--){
				System.out.print(" ");
			}
	
			for(int k = 0; k < i;k++){
				System.out.print(myArray[k]);
			}
			
			for(int z = 0; z < i ; z++){
				System.out.print(myArray[z]);
			}
			System.out.println();	
		}
		
	}
}





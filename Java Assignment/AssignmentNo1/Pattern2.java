class Pattern2{
	public static void main(String[] args){
		for(int m = 1 ,k = 5 ; m <= 5; m++){
			
			for(int i = m ; i < k ; i++){
				System.out.print(" ");
			}	
			
			for(int j = 1; j <= m ; j++){
				System.out.print(" "+m);
			}
			
		System.out.println();
		}
	}
}
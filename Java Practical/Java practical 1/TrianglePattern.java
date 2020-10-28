class TrianglePattern{
	public static void main(String[] args){
		for(int m = 5 ,k = 5 ; m >= 1; m--){
			
			for(int i = m ; i < k ; i++){
				System.out.print(" ");
			}	
			
			for(int j = m; j >= 1 ; j--){
				System.out.print( " *");
			}
			
		System.out.println();
		}
	}
}
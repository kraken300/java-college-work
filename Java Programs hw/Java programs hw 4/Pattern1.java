class Pattern1{
	public static void main(String[] args){
		for(int i = Integer.parseInt(args[0]),z = 1; i > 0; i--,z++){
			for(int j = 1; j <= z ; j++){
				System.out.print(j);
			}
			System.out.println();	
		}	
	}
}
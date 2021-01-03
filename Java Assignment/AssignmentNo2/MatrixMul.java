class MatrixMul{
	public static void main(String[] args){
		int[][] mat1 = {{1,1},{1,1}};
		int[][] mat2 = {{1,1},{1,1}};
		int[][] mat3 = new int[2][2];
		
		for(int i=0; i < 2 ; i++){
			for(int j=0; j < 2 ; j++){
				mat3[i][j] = 0;
				for(int k = 0; k < 2 ; k++){
					mat3[i][j] += mat1[i][k] * mat2[k][j]; 
				}
				System.out.print(mat3[i][j] + " ");
			}
			System.out.println();
		}
	}
}

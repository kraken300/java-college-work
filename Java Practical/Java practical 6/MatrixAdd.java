import java.util.Scanner;
class MatrixAdd{
	public static void main(String[] args){
		Scanner input1 = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int a = input1.nextInt();
		
		Scanner input2 = new Scanner(System.in);
		System.out.print("Enter number of columns : ");
		int b = input2.nextInt();
		
		int mat1[][] = new int[a][b];
		int mat2[][] = new int[a][b];
		int mat3[][] = new int[a][b];
		
		Scanner elements1 = new Scanner(System.in);
		System.out.println("Enter elements in Matrix 1: ");
		for(int x = 0 ; x < a; x++){
			for(int y = 0 ; y < b; y++){
				mat1[x][y] = elements1.nextInt();
			}
		}
		
		Scanner elements2 = new Scanner(System.in);
		System.out.println("Enter elements in Matrix 2 : ");
		for(int c = 0 ; c < a; c++){
			for(int d = 0 ; d < b; d++){
				mat2[c][d] = elements2.nextInt();
			}
		}
		
		System.out.println("Resultant Matrix : ");
		for(int i = 0 ; i < a; i++){
			for(int j = 0 ; j < b; j++){
				mat3[i][j] = mat1[i][j] + mat2[i][j];
				System.out.print(mat3[i][j] + " ");
			}
			System.out.println();
		}
	}
}
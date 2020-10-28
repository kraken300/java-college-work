import java.util.Scanner;
class MulTable{
	int num;
	MulTable(int a){
		num = a;
	}
	
	void mul(){
		for(int i = 1; i <= 10; i++){
			System.out.println(num + " * " + i + " = " + (num*i) );
		}
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter table : ");
		int n = input.nextInt();
		MulTable table = new MulTable(n);
		table.mul();
	}
}
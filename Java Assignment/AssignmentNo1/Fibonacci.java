import java.util.Scanner;
class Fibonacci{
	public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			System.out.print("Enter Fibonacci Range : ");
			int fibo = input.nextInt();
			
			int a = -1;
			int b = 1;
			int c;
			int i = 1;
		do{
			c = a+b;
			a = b;
			b = c;

			i++;
			System.out.println(c);
		}while(i <= fibo );

	}
}
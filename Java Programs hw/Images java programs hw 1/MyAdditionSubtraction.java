import java.util.Scanner;
class MyAdditionSubtraction{
	public static void main(String[] args){
		int a,b;
		Scanner num1 = new Scanner(System.in);
		System.out.print("Enter first number : ");
		a = num1.nextInt();
		
		Scanner num2 = new Scanner(System.in);
		System.out.print("Enter second number : ");
		b = num2.nextInt();
		int c = a + b;
		int d = a - b;
		
		System.out.println("Addition is "+c);
		System.out.println("Subtraction is "+d);
		
	}
}
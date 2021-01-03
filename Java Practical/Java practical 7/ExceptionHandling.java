import java.util.Scanner;
class ExceptionHandling{
	public static void main(String[] args){
		try{
			Scanner num1 = new Scanner(System.in);
			System.out.print("Enter first number : ");
			int a = num1.nextInt();
			
			Scanner num2 = new Scanner(System.in);
			System.out.print("Enter second number : ");
			int b = num2.nextInt();
			
			int c = a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e){
			System.out.println("Cannot divide by zero");
		}	
			
	}
}
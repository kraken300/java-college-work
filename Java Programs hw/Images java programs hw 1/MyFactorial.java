import java.util.Scanner;
class MyFactorial{
	public static void main(String[] args){
		int fact = 1;
		int userfact;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter factorial : ");
		userfact = input.nextInt();
		
		while(userfact > 1){
			fact = fact * userfact;
			userfact--;
		}
		System.out.println("The factorial is "+fact);
	}
}
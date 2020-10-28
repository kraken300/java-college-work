import java.util.Scanner;
class MyPrimeNumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = input.nextInt();
		
		if(num == 1){
			System.out.println("1 is neither a prime nor a composite number");
		}
		else if(num == 2){
			System.out.println("2 is a prime number");
		}
		else if(num % 2 == 0){
			System.out.println(num +" is not a prime number");
		}
		else{
			System.out.println(num +" is a prime number");
		}
		
		
	}
}
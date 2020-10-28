import java.util.Scanner;
class Per{
	int p,q,r;
	
	
	Per(int a, int b,int c){
		p = a;
		q = b;
		r = c;
	}
	
	float Percentage(){
		float sum = p + q + r;
		return ((sum*100)/300);
	}
	
	void display(){
	float result = Percentage();
	System.out.println("Result is " + result + "%");
	}
}
class Nesting{
	public static void main(String[] args){
		Scanner subject1 = new Scanner(System.in);
		System.out.print("Enter subject 1 marks : ");
		int s1 = subject1.nextInt();
		
		Scanner subject2 = new Scanner(System.in);
		System.out.print("Enter subject 2 marks : ");
		int s2 = subject2.nextInt();
		
		Scanner subject3 = new Scanner(System.in);
		System.out.print("Enter subject 3 marks : ");
		int s3 = subject3.nextInt();
		
		Per myPercentage = new Per(s1,s2,s3);
		myPercentage.display();
		
	}
}
import java.util.Scanner;
class ProfessionalCourse{
	public static void main(String[] args){
		Scanner m = new Scanner(System.in);
		System.out.print("Enter mathematics marks : ");
		int maths = m.nextInt();
		
		Scanner p = new Scanner(System.in);
		System.out.print("Enter physics marks : ");
		int physics = p.nextInt();
		
		Scanner c = new Scanner(System.in);
		System.out.print("Enter mathematics marks : ");
		int chemistry = c.nextInt();
		
		int total = maths  + physics + chemistry;
		int total_mp = maths + physics;
		if (maths >= 60){
			System.out.println("Eligible candidate");
		}
		else if (physics >= 50){
			System.out.println("Eligible candidate");
		}
		else if (chemistry >= 40){
			System.out.println("Eligible candidate");
		}
		else if (total >= 200 || total_mp >= 150){
			System.out.println("Eligible candidate");
		}
		else{
			System.out.println("Not Eligible");
		}
		
	}
}
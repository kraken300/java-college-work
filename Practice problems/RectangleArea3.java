import java.util.Scanner;
class RectArea{
	int length;
	int breadth;
	
	RectArea(int x,int y){
		length = x;
		breadth = y;
	}
	int rectArea(){
		return length * breadth;
	}
}


class RectangleArea3{
	public static void main(String[] args){
		Scanner input1 = new Scanner(System.in);
		System.out.print("Enter length : ");
		int l = input1.nextInt();
		
		Scanner input2 = new Scanner(System.in);
		System.out.print("Enter breadth : ");
		int b = input2.nextInt();
		
		RectArea objl = new RectArea(l,b);
		//objl.rectLB(2,3);
		int a = objl.rectArea();
		System.out.println("The area of rectanglw with lenght "+l+" and breadth "+b+" is "+a);
		
	}
}
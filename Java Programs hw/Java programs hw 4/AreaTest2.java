import java.util.Scanner;
class Area1{
	final float pi = 3.14f;
	int r;
	float CircleArea(){
		return pi*r*r;
	}
}

class Area2 extends Area1{
	int b,h ;
	float num = 0.5f;
	float TriangleArea(){
		return num*b*h;
	}
}

class Area3 extends Area2{
	void setVal(int x,int y,int z){
		r = x;
		b = y;
		h = z;	
	}
	
	void display(){
		float myCircle = CircleArea();
		float myTriangle = TriangleArea();
		System.out.println("Area of circle is : " + myCircle);
		System.out.println("Area of triangle is : " + myTriangle);
	}
}

class AreaTest2{
	public static void main(String[] args){
		Scanner input1 = new Scanner(System.in);
		System.out.print("Enter radius of circle : ");
		int radius = input1.nextInt();
		
		Scanner input2 = new Scanner(System.in);
		System.out.print("Enter radius of circle : ");
		int length = input2.nextInt();
		
		Scanner input3 = new Scanner(System.in);
		System.out.print("Enter radius of circle : ");
		int breadth = input3.nextInt();
		
		Area3 myObj = new Area3();
		myObj.setVal(radius,length,breadth);
		myObj.display();
	}
}
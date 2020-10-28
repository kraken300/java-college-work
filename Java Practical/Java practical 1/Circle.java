import java.util.Scanner;
class Circle{
	int radius;
	float pi = 3.14f;
	
	Circle(int r){
		radius = r;
	}
	
	float cirArea(){
		return pi*radius*radius;
	}
	
	float cirPerimeter(){
		return 2*pi*radius;
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter radius of a circle : ");
		int in = input.nextInt();
		Circle obj1 = new Circle(in);
		float Area = obj1.cirArea();
		float Perimeter = obj1.cirPerimeter();
		System.out.println("Area of a circe is " + Area);
		System.out.println("Perimeter of a circle is "+ Perimeter);
	}
}
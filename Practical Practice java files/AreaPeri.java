package PracticalPractice;

import java.util.Scanner;

class AreaPeri{
	
	float radius;
	float pi = 3.14f;
	AreaPeri(float rad){
		radius = rad;
	}
	
	float area(){
		return pi*radius*radius;
	}
	
	float perimeter(){
		return 2*pi*radius;
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter radius of a circle : ");
		float input = in.nextFloat();
		
		AreaPeri obj = new AreaPeri(input);
		
		float r = obj.radius;
		float a = obj.area();
		float p = obj.perimeter();
		System.out.println("The area of a circle with radius "+r+" is "+a);
		System.out.println("The perimeter of a circle with radius "+r+" is "+p);
	}
}
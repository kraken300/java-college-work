class Area1{
	final float pi = 3.14f;
	int r;
	float CircleArea(){
		return pi*r*r;
	}
}

class Area2 extends Area1{
	int b,h;
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

class AreaTest{
	public static void main(String[] args){
		Area3 myObj = new Area3();
		myObj.setVal(5,5,5);
		myObj.display();
	}
}
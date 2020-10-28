class CircleArea1{
	int r;
	final float pi  = 3.14f;
	
	public static void main(String[] args){
		CircleArea1 obj = new CircleArea1();
		obj.r = 5;
		
		float area =  obj.pi * obj.r * obj.r; 
		System.out.println("Area = " + area);
	}
}

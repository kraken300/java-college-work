class Circle
{
	int radius;
	float pi = 3.14f;
	
	void getData(int x)
	{
		radius = x;
	}
	float cirArea()
	{
		float area = pi*radius*radius;
		return (area);
	}
	
}
class CircleArea2
{
	public static void main(String args[])
	{
		float area;
		Circle cir = new Circle();
	
		cir.getData(5);
		area = cir.cirArea();
		
		System.out.println("Area = " + area);
		
	}
}
class MathOperation2{
	float mul(float x,float y){
		return x*y;
	}
	
	float divide(float x,float y){
		return x/y;
	}
}
class MathApplication2{
	public static void main(String[] args){
		MathOperation2 mathObj = new MathOperation2();
		float a = mathObj.mul(4.05f,5.0f);//book values3
		float b = mathObj.divide(a,2.0f);//book values3
		System.out.println("b = " + b);
		
	}
}
class Construct{
	String name;
	String located;
	int pincode;
	Construct(String x,String y,int z){
		name = x;
		located = y;
		pincode = z;
	}
	
	
	public static void main(String[] args){
		Construct myCollege = new Construct("B.K.Birla College","Kalyan",421301);
		System.out.println("College name : " + myCollege.name);
		System.out.println("College location : " + myCollege.located);
		System.out.println("Pincode : " + myCollege.pincode);
	}
}
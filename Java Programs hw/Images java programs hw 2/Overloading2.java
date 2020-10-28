class myClass{
	void personalDetails(String a, String b){
		System.out.println("Name : "+a);
		System.out.println("Address: " + b);
	}
	
	void personalDetails(int a, int b){
		System.out.println("Pin code : " + b);
		System.out.println("Phone no. : "+a);
	}
	}

class Overloading2{
	public static void main(String[] args){
		myClass obj = new myClass();
		obj.personalDetails("Raj","Mumbai");
		obj.personalDetails(123456789,400001);
	}
}
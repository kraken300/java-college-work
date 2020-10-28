class myClass{
	void evenOdd(int a){
		if(a%2 == 0){
			System.out.println(a+" is an even number");
		}
		else{
			System.out.println(a+" is a odd number");
		}
	}
	
	void evenOdd(int a,int n){
		//for printing even numbers between a-starting of range  and n-ending of range
		for(int i = a; i <= n; i++){
			if(i%2 == 0){
			System.out.println(i);
			}
		}
	}
}
class Overloading1{
	public static void main(String[] args){
		myClass obj = new myClass();
		obj.evenOdd(3);
		System.out.println("Even numbers are : ");
		obj.evenOdd(10,20);
	}
}
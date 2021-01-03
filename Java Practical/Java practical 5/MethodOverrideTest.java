interface Phone1{
	void brand();
}

class Phone2 implements Phone1{
	public void brand(){
		System.out.println("Brand : Micromax");
	}
}


class MethodOverrideTest{
	public static void main(String[] args){
		Phone2 myObj = new Phone2();
		myObj.brand();
	}
}









//1.Write a Java Program to reverse a string.
//2.Find the smallest and largest element from the array
//Design a class SortData that contains 
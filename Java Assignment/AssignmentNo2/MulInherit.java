class First{
	void level1(){
		System.out.println("The first level is of decomposers.");
	}
}

class Second extends First{
	void level2(){
		System.out.println("The second level is of consumers.");
	}
}

class Third extends Second{
	void level3(){
		System.out.println("The third level is of producers.");
	}
}

class MulInherit{
	public static void main(String[] args){
		Third myObj = new Third();
		System.out.println("Ecosystem levels : ");
		myObj.level1();
		myObj.level2();
		myObj.level3();
	}
}
class Fruits{
	void Apple(){
		System.out.println("Apple : ");
		System.out.println("Apples are good for health and they are red in color");
	}
}

class Fruits2 extends Fruits{
	void Chikoo(){
		System.out.println("Chikoo : ");
		System.out.println("Chikoos are good for skin and they are brown in color");
	}
}

class SingleInheritTest{
	public static void main(String[] args){
		Fruits2 myFruits = new Fruits2();
		myFruits.Apple();
		myFruits.Chikoo();	
	}
}
class Elements{
	void metal(){
		System.out.println("Metals Properties:");
		System.out.println("Metals are hard,shiny and can conduct electricity");
	}
	
	void nonMetal(){
		System.out.println("Non-metals Properties:");
		System.out.println("Non-metals are soft,non shiny and cannot conduct electricity");
	}
}

class Materials extends Elements{
	void aluminium(){
		super.metal();
		System.out.println("Aluminium : It is one of the most used metals");
	}
	
	void phosphorus(){
		super.nonMetal();
		System.out.println("Phosphorus : There are white, red, violet and black colour phosphorus");
	}
	void display(){
		aluminium();
		phosphorus();
	}
}

class Overriding{
	public static void main(String[] args){
		Materials object = new Materials();
		object.display();
	}
}
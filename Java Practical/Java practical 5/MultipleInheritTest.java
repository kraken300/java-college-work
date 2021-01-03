interface PhoneSpecs{
	void specs();
}

interface PhonePrice{
	void price();
}


class Phone implements PhoneSpecs,PhonePrice{
	public void specs(){
		System.out.println("Specs : 6Gb Ram, 128Gb Internal Storage, Snapdragon 720, 48 MP Camera");
	}
	
	public void price(){
		System.out.println("The price of the phone is 20000 Rupees");
	}
}

class MultipleInheritTest{
	public static void main(String[] args){
		Phone myPhone = new Phone();
		myPhone.specs();
		myPhone.price();
	}
}
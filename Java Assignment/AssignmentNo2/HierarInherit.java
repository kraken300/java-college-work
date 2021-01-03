class Subject{
	void Compulsory(){
		System.out.println("Following are the madatory subjects for First Year : ");
		String[] mySub = {"Maths","Java","Data Communication","Database"};
		for(int i =0 ; i < mySub.length; i++){
			System.out.println(mySub[i] + " ");
		} 
		System.out.println();
	}
}

class Option1 extends Subject{
	void Language(){
		System.out.println("For students interested in Foreign Language can choose any one language from below options: ");
		String[] lang = {"Japanese","Russian","German","Korean"};
		for(int j =0 ; j < lang.length; j++){
			System.out.println(lang[j] + " ");
		}
		System.out.println();
	}
}

class Option2 extends Subject{
	void Art(){
		System.out.println("For students interested in Art can choose any one topic from below options: ");
		String[] art = {"Street Art","Painting","Statue Making","Clay art"};
		for(int k =0 ; k < art.length; k++){
			System.out.println(art[k] + " ");
		}
	}
}

class HierarInherit{
	public static void main(String[] args){
		//Subjext myObj = new Subject();
		Option1 myObj1 = new Option1();
		Option2 myObj2 = new Option2();
		myObj1.Compulsory();
		myObj1.Language();
		myObj2.Art();
		
	}
}
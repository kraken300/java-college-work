class HotelMenu{
	void menu1(){
		System.out.println("List of items for every Eaters : ");
		String[] myList = {"Dal and Rice","Fruit Salad","Palak Paneer","Paneer Tikka"};
		for(int i =0 ; i < myList.length; i++){
			System.out.println(myList[i] + " ");
		} 
		System.out.println();
	}
}
class NonVeg extends HotelMenu{
	void menu2(){
		System.out.println("List of items for Non-Veg Eaters : ");
		String[] myList2 = {"Chicken Fry","Chicken Gravy","Fish Fry","Fish Gravy"};
		for(int j =0 ; j < myList2.length; j++){
			System.out.println(myList2[j] + " ");
		} 
	}
}

class SingleInherit{
	public static void main(String[] args){
		NonVeg order = new NonVeg();
		order.menu1();
		order.menu2();
	}
}
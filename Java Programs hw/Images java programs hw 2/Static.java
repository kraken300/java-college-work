import java.util.Scanner;
class FoodList{
	static void Cola(){
		System.out.println("Thank you for ordering Cola!");
		System.out.println("You will get your order soon!");
	}
	
	static void Pizza(){
		System.out.println("Thank you for ordering Pizza!");
		System.out.println("You will get your order soon!");
	}
	
	static void Burger(){
		System.out.println("Thank you for ordering Burger!");
		System.out.println("You will get your order soon!");
	}
	
	static void FrenchFries(){
		System.out.println("Thank you for ordering French Fries!");
		System.out.println("You will get your order soon!");
	}
}
class Static{
	public static void main(String[] args){
		
		System.out.println("1. Cola");
		System.out.println("2. Pizza");
		System.out.println("3. Burger");
		System.out.println("4. French Fries");
		
		Scanner option = new Scanner(System.in);
		System.out.println("Please select one : ");
		int order = option.nextInt();
		
		switch(order){
		case 1:
			FoodList.Cola();
			break;
		case 2:
			FoodList.Pizza();
			break;
		case 3:
			FoodList.Burger();
			break;
		case 4:
			FoodList.FrenchFries();
			break;
		default:
		System.out.println("Sorry, you have selected a wrong option!");	
		}
	}
}
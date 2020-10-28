import java.util.*;
class ShoppingList{
	public static void main(String[] args){
		Vector <String> shopList = new Vector <String> ();
		System.out.print("The shopping list is : ");
		for(int i = 0 ; i < args.length ; i++){
			String words = args[i];
			shopList.add(words);
		}
		System.out.print(shopList);	
	}
}
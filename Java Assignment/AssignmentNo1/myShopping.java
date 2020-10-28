import java.lang.*;
import java.io.*;
import java.util.*;
class myShopping{
	public static void main(String[] args){
		// char[] mychar = {'a','b','v'};
		// System.out.println(mychar[0]);	
		// System.out.println(mychar[1]);	
		//char[] words;
		Vector <String> list = new Vector <String>();
		System.out.print("The shopping list is : ");
		for(int i = 0 ; i < args.length ; i++){
			String words = args[i];
			//System.out.println(words);
			//Vector <String> list = new Vector <String>();
			list.add(words);
			//System.out.print(list);
		}
		System.out.print(list);
		// Vector list = new Vector ();
		// list.add(words);
		// list.add();
		// System.out.print(list);	
		
	}
}
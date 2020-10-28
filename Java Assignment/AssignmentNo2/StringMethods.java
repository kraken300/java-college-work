class StringMethods{
	public static void main(String[] args){
		String upCase,lowCase,replace,trim,concat,substring,substring2,value,to_string,val_int;
		int length, i = 1234,index_of,index_of2;
		char char_at;
		String myStr = new String("An apple a day keeps doctor away");
		String myStr2 = new String("  Where there is good food,there is happiness  ");
		System.out.println("Original string1 : "+ myStr);
		System.out.println("Original string2 : "+ myStr2);
		
		lowCase = myStr.toLowerCase();
		upCase = myStr.toUpperCase();
		replace = myStr.replace("doctor","disease");
		trim = myStr2.trim();
		//myStr.equals(myStr2);
		//myStr.equalsIgnoreCase(myStr2);
		myStr.compareTo(myStr2);
		concat = myStr.concat(myStr2);
		
		length = myStr.length();
		char_at = myStr.charAt(3);
		substring = myStr.substring(15);
		substring2 = myStr.substring(15,20);
		value = String.valueOf(myStr);
		val_int = String.valueOf(i);
		to_string = val_int.toString();
		index_of = myStr.indexOf('a');
		index_of2 = myStr.indexOf('a',15);
		
		System.out.println("Lowercase : " + lowCase);
		System.out.println("Uppercase : " + upCase);
		System.out.println("Replace : " + replace);
		System.out.println("Trim : " + trim);
		System.out.println("Equals : " + myStr.equals(myStr2));
		System.out.println("Equals Ignorecase: " + myStr.equalsIgnoreCase(myStr2));
		System.out.println("Length of string1 : " + length);
		System.out.println("Character at : " + char_at);
		System.out.println("Comparison : " + myStr.compareTo(myStr2));
		System.out.println("Concatenation : " + concat);
		System.out.println("Substring1 : " + substring);
		System.out.println("Substring2 : " + substring2);
		System.out.println("Value : " + value);
		System.out.println("Value of integer : " + val_int);
		System.out.println("To string : " + to_string);
		System.out.println("Index of : " + index_of);
		System.out.println("Index of2: " + index_of2);
				
	}
}
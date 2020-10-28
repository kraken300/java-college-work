class StringManipulation{
	public static void main(String[] args){
		StringBuffer myStr = new StringBuffer("Success  It is an accumulation of hardwork");
		
		//Length
		int a = myStr.length();
		System.out.println("Length is : " + a);
		
		//Displaying
		for(int i = 0; i <  myStr.length(); i++){
			System.out.println("Character at "+ i +" "+ myStr.charAt(i));
		}
		
		//Inserting a sting in the middle
		myStr.insert(42,", perseveance");
		System.out.println("After inserting : "+ myStr);
		
		//Modifying characters
		myStr.setCharAt(7,'-');
		System.out.println("Modified string : "+ myStr);
		
		//Appending
		myStr.append(" and persistence");
		System.out.println("After appending : "+ myStr);
		
	
	}
}
class String_Buffer{
	public static void main(String[] args){

		StringBuffer myStr = new StringBuffer("Perseverance is the key to success");
		StringBuffer myStr2 = new StringBuffer("Prevention is better than cure");
		System.out.println("Before set character : " + myStr);
		//System.out.println(printPoint(myStr.setCharAt(2,'a')));
		myStr.setCharAt(2,'Z');
		System.out.println("After set character : " + myStr);
		System.out.println("Append : " + myStr.append(myStr2));
		System.out.println("Insert : " + myStr.insert(2,myStr2));
		myStr.setLength(16);
		System.out.println("Length : " + myStr);
		
		
		
	}
}
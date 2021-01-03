class WrapperDemo{
	public static void main(String[] args){
		Integer myInt = new Integer(5);
		Float myFloat = new Float(5.5);
		Double myDouble = new Double(666.55);
		Long myLong = new Long(6663);
		
		System.out.println("Wrapper Classes : ");
		System.out.println(myInt +" Integer class");
		System.out.println(myFloat+" Float class");
		System.out.println(myDouble+" Double class");
		System.out.println(myLong+" Long class");
		
		System.out.println("Primitive types : ");
		int myInt2 = myInt.intValue();
		float myFloat2 = myFloat.floatValue();
		double myDouble2 = myDouble.doubleValue() ;
		long myLong2 = myLong.longValue();
		
		System.out.println(myInt2 +" int type");
		System.out.println(myFloat2 +" float type");
		System.out.println(myDouble2 +" double type");
		System.out.println(myLong2 +" long type");
	}
}
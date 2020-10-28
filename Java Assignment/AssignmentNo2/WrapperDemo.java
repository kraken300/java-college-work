class WrapperDemo{
	public static void main(String[] args){
		Integer myInt = new Integer(5);
		
		Float myFloat = new Float(5.5);
		
		Double myDouble = new Double(666.55);
		
		Long myLong = new Long(6663);
		
		System.out.println("Wrapper Classes : ");
		System.out.println(myInt +" - "+ myInt.getClass().getSimpleName());
		System.out.println(myFloat+" - "+myFloat.getClass().getSimpleName());
		System.out.println(myDouble+" - "+myDouble.getClass().getSimpleName());
		System.out.println(myLong+" - "+myLong.getClass().getSimpleName());
		
		System.out.println("Primitive types : ");
		int myInt2 = myInt.intValue();
		float myFloat2 = myFloat.floatValue();
		double myDouble2 = myDouble.doubleValue() ;
		long myLong2 = myLong.longValue();
		
		System.out.println(myInt2 +" - "+ myInt2.getClass().getSimpleName());
		System.out.println(myFloat2 +" - "+ myFloat2.getClass().getSimpleName());
		System.out.println(myDouble2 +" - "+ myDouble2.getClass().getSimpleName());
		System.out.println(myLong2 +" - "+ myLong2.getClass().getSimpleName());
		
	}
}
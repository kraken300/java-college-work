class CommandLineArg{
	public static void main(String[] args){
		//for(int i=0;i<args.length;i++){
		//System.out.println(args[0]);
		//System.out.println(args[1]);
		//System.out.println(args[2]);
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = a + b;
		int d = a - b;
		int e = a * b;
		int f = a / b;
		System.out.println("Sum is "+c);
		System.out.println("Subtraction is "+d);
		System.out.println("Multiplication is "+e);
		System.out.println("Division is "+f);
	}
}
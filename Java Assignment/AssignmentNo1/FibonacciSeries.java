class FibonacciSeries{
	public static void main(String[] args){
		int a = -1;
		int b = 1;
		int c;
		System.out.println("The Fibonacci Series upto 15 is : ");
		for(int i = 1 ; i <= 15 ; i++){
			c = a+b;
			a = b;
			b = c;
			System.out.print(c +" ");
		}
	}
}
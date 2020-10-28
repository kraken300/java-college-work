import java.util.Scanner;
class FahrenToCelsius{
	public static void main(String[] args){
		Scanner f = new Scanner(System.in);
		System.out.print("Enter temperature (F) : ");
		float val = 1.8f;
		int fahren = f.nextInt();
		float celsius = (fahren-32)/val;
		System.out.print("Temperature in celsius  : "+celsius+" *C");
	}
}
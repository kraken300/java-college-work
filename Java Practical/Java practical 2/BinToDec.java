import java.util.Scanner;
class BinToDec{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		long binNum , deciNum = 0, z = 1, remainder;
		System.out.print("Input a binary number : ");
		
		binNum = input.nextLong();
		
		while(binNum != 0){
			remainder = binNum % 10;
			deciNum = deciNum + remainder * z;
			z = z * 2;
			binNum = binNum / 10;
		}
		System.out.print("Decimal number is : " + deciNum);
	}
}
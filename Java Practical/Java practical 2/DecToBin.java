import java.util.Scanner;
class DecToBin{
	public static void main(String[] args){
		int userNum, quotient, l=1, m;
		int binNum[] = new int[100];
		Scanner input = new Scanner(System.in);
		System.out.print("Input a decimal number : ");
		userNum = input.nextInt();
		
		quotient = userNum;
		
		while(quotient != 0){
			binNum[l++] = quotient % 2;
			quotient = quotient / 2;
		}
		System.out.print("Binary number is : ");
		for(m = l -1; m > 0; m--){
			System.out.print(binNum[m]);
		}
		System.out.print("\n");
	}
}
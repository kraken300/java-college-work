import java.util.Arrays;
import java.util.Scanner;
class AlphabetOrder{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter word : ");
		String myString = input.nextLine();
		
		char[] myChar = myString.toCharArray();
		Arrays.sort(myChar);
		System.out.print(new String(myChar));
		
	}
}
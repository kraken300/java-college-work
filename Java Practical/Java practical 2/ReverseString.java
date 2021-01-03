import java.util.Scanner;
class ReverseString{
	public static void main(String[] args){
		Scanner inString = new Scanner(System.in);
		System.out.print("Enter string : ");
		
		char[] myChar = inString.nextLine().toCharArray();
		
		System.out.print("The reversed string is : ");
		for(int i =  myChar.length - 1; i >= 0; i--){
			System.out.print(myChar[i]);	
		}
	}
}

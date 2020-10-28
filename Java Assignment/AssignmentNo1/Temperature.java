import java.util.Scanner;
class Temperature{
	public static void main(String[] args) {
		int temperature[][] = new int[7][4];
		String myCity[]= {"Nagpur","Mumbai","Agra","Bhopal"};
			
		Scanner input = new Scanner(System.in);
		for (int a = 0; a < 7; a++) {
			for (int b = 0; b < 4; b++) {
				System.out.print(myCity[b]+"'s temperature on "+(a+1)+" is : ");
				temperature[a][b] = input.nextInt();
			}
		}
		int high = 0,low = 100;
		for (int p = 0; p < 7; p++) {
			for (int q = 0; q < 4; q++) {
				if(high<temperature[p][q])
					high = temperature[p][q];
				if(low>temperature[p][q])
					low = temperature[p][q];
			}
		}
	System.out.print("Higest temperature : "+high+"\n");
	System.out.print("Lowest temperature : "+low);
	}
}
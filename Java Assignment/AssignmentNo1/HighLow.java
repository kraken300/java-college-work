public class HighLow {
    public static void main(String[] args) {
            int myLow = 15 ;
            int myHigh = 50 ;
            int temperature[][] = new int[31][10];
            String myCity[]= {"Nagpur","Mumbai","Agra","Bhopal","Chennai","Kolkata","Hyderabad","Ahmedabad","Jaipur","Pune"};
            for (int a = 0; a < 31; a++) {
                for (int b = 0; b < 10; b++) {
                    double myRandom=Math.random() * (myHigh - myLow + 1) + myLow ;
                    temperature[a][b] = (int)(Math.random() * (myHigh - myLow + 1) + myLow);           
				}
            }
			
            int highTemp = 15,lowTemp = 50;
            for (int p = 0; p < 31; p++) {
				for (int q = 0; q < 10; q++) {
                    if(highTemp<temperature[p][q])
                        highTemp = temperature[p][q];   
                        if(lowTemp>temperature[p][q])
                            lowTemp = temperature[p][q];
                }
            }

			System.out.print("Highest temperature : "+highTemp+"\n");
            System.out.print("Lowest temperature : "+lowTemp);
	}
}
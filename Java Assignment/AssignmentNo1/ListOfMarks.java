class ListOfMarks{
	public static void main(String[] args){
		int[] i = {10,20,30,40,50,60,70,80,90,100};
		int a = 0 , b = 0 , c = 0 , d = 0;
		for(int j = 0 ; j < i.length ; j++){
			if (i[j] >= 81 && i[j] <= 100){
				a++;
			}
			else if (i[j] >= 61 && i[j] <= 80){
				b++;
			}
			else if (i[j] >= 41 && i[j] <= 60){
				c++;
			}
			else if (i[j] >= 0 && i[j] <= 40){
				d++;
			}
		}
		System.out.println("Number of students between 81 and 100 : " + a);
		System.out.println("Number of students between 61 and 80 : " + b);
		System.out.println("Number of students between 41 and 60 : " + c);
		System.out.println("Number of students between 0 and 40 : " + d);
			
	}
}
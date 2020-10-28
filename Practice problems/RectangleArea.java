class RectangleArea{
	int length;
	int breadth;
	void rectLB(int x,int y){
		length = x;
		breadth = y;
	}
	int rectArea(){
		return length * breadth;
	}
	public static void main(String[] args){
		RectangleArea objl = new RectangleArea();
		objl.rectLB(2,3);
		int a = objl.rectArea();
		System.out.println(a);
		
	}
}
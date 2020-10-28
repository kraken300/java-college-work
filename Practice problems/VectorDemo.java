import java.util.Vector;
class VectorDemo{
	public static void main(String[] args){
		Vector <String> myVec = new Vector <String>();
		myVec.add("Apple");
		myVec.add("Pineapple");
		myVec.add("Green apple");
		myVec.add("Custard apple");
		
		System.out.println("My fruit list : " + myVec);
	}
}
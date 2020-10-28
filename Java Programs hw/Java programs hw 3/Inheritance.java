class Work{
	void teaching(){
		System.out.println("Teaching : Teacher teaches." );
	}
	
	void administartor(){
		System.out.println("Admin Work : Office manages administrative work." );
	}
	
}

class MyWork extends Work{
	void study(){
		System.out.println("Students study." );
	}
	
	void job(){
		System.out.println("Students job : To score good marks." );
	}
}
class Inheritance{
	public static void main(String[] args){
		MyWork obj = new MyWork();
		obj.teaching();
		obj.administartor();
		obj.study();
		obj.job();
	}
}
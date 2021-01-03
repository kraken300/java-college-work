class Thread1 extends Thread{
	public void run(){
		for(int i = 1; i <= 10;i++){
			try{
				Thread.sleep(200);
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
			System.out.println("Welcome World");
		}
	}
}
	
class Thread2 extends Thread{
	public void run(){
		for(int j = 1; j <= 10;j++){
			try{
				Thread.sleep(200);
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
			System.out.println("Hello World");
		}
	}	
}	

class TwoThreads extends Thread{
	public static void main(String[] args){
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		
		t1.start();
		t2.start();
	}
}
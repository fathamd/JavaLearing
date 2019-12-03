package mapping;

public class multithrd extends Thread{
	public void run(){
		System.out.println("thread name"); 
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		multithrd t1= new multithrd();
		multithrd t2= new multithrd();
		t1.start();
		t2.start();
		System.out.println();
	}

}

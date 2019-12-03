package mapping;

public class threadrunnable implements Runnable {
	public void run(){
		System.out.println("hello");
	} 

	public static void main(String[] args) {
		threadrunnable m1=new threadrunnable();
		Thread t1=new Thread(m1);
		t1.start();
	}

}

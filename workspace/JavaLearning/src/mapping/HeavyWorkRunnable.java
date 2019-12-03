package mapping;

public class HeavyWorkRunnable extends Thread {
public HeavyWorkRunnable(String arg0) {
		super(arg0);
	}

public void run(){
	System.out.println("thread name"); 
	System.out.println(Thread.currentThread().getName());
}
}

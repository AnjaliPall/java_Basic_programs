package multiThreading;

public class MyThread implements Runnable {
	
	@Override
	public void run() {
		
		for(int i=0;i<=10;i++) {
			System.out.println("The value of i is: " +i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		MyThread t = new MyThread();
		AnotherThread at = new AnotherThread();
		Thread th = new Thread(t);
		th.start();
		at.start();

	}
}

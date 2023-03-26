package multiThreading;
class UserThread extends Thread{
	public void run() {
		//task for thread...
		System.out.println("This is the Userthread");
	}
}

public class ThreadOp {

	public static void main(String[] args)  {
		System.out.println("Program Started....");
		int x=56+34;
		 System.out.println("sum is; " +x);
		 
		 //Thread....
		 Thread t = Thread.currentThread();
		 String tname = t.getName();
		 System.out.println("current Runnng Thread is: " +tname);
		 
		 //setName
		 t.setName("MyMain");
         
		 System.out.println(t.getName());
		 
		 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		 System.out.println(t.getId());		 
		 System.out.println("Program Ended...");
		 UserThread th = new UserThread();
		 th.start();
		 
	}

}

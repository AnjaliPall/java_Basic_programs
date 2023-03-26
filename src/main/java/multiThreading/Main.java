package multiThreading;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Company comp =new Company();
      Producer p =new Producer(comp);
      Consumer c1 =new Consumer(comp);
      p.start();
      c1.start();
	}

}

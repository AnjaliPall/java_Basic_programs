package abstraction;

public class Android_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mobile m;
		m = new IOS();
		m.doubleTap();
		
		m = new Android();
		m.doubleTap();
		m.abc();
	}

}

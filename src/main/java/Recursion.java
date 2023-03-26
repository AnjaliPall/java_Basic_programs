
public class Recursion {

	public static void main(String[] args) {
	int result = sum(5,10);
	System.out.println(result);

	}
	public static int sum(int s, int e) {
		if(e>s) {
			System.out.println( e + sum(s,e-1));
			return e + sum(s,e-1);
		}
		else {
			return e;
		}
	}

}

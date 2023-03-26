import java.util.Scanner;

public class NumberAdditon {

	public static void main(String[] args) {
	int x,y,sum;
	Scanner myObj = new Scanner(System.in);
	System.out.println("Type a Number");
	x = myObj.nextInt();
	
	System.out.println("Type another Number");
	y = myObj.nextInt();
	
	sum = x+y;
	System.out.println("The sum is " + sum);
	
	}

}

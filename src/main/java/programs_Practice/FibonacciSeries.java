package programs_Practice;

import java.util.Scanner;

//0 1 1 2 3 5 8 11 13 21 34

public class FibonacciSeries {

	public static void main(String[] args) {
//		int n1=0, n2=1, sum=0;
		int n1, n2, sum=0;
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter n1 and n2");
		n1= s1.nextInt();
		n2= s1.nextInt();
		
		System.out.print(n1+ " " +n2);
		
		for(int i=2;i<10;i++) {
			sum=n1+n2;
			System.out.print(" " +sum);
			n1=n2;
			n2=sum;			
		}

	}

}

package programs_Practice;

import java.util.Scanner;

public class NumberPrimeOrNot {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter The Number");
		int num = s1.nextInt();
		int count=0;
		
		if(num>0) {
			for(int i=1;i<=num;i++) {
				if(num%i==0) {
					count++;
				}
			}
			if(count==2)
				System.out.println("Prime Number");
			else
				System.out.println("Not a Prime Number");
			
		}else {
			System.out.println("Not a Prime Number");
		}
       
	}

}

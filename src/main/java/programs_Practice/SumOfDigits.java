package programs_Practice;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s1 = new Scanner(System.in);
     System.out.println("Enter The Digit");
     int num = s1.nextInt();
     
     int sum=0;
     while(num>0) {
    	 int rem = num%10;
    	 sum=sum+rem;
    	 num=num/10;
     }
     System.out.println("Sum os digits is " +sum);
	}

}

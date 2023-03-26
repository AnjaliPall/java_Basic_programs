package programs_Practice;

import java.util.Scanner;

public class CountNumberOfDigits {

	public static void main(String[] args) {

     Scanner s1 = new Scanner(System.in);
     System.out.println("Enter the Number");
     long num = s1.nextLong();
     
     int count=0;
     while(num>0) {
    	 num = num/10;
    	 count++;
     }
     System.out.println("Number of digits in entered number are " +count);
     
	}

}

package programs_Practice;

import java.util.Scanner;

public class CountEvenAndOddDigits {

	public static void main(String[] args) {
		
       Scanner s1 = new Scanner(System.in);
       System.out.println("Enter the Number");
       long num = s1.nextLong();
       int evenCount=0,oddCount=0;
       
       while(num>0) {
    	   int rem = (int)num%10;
    	   if(rem%2==0) {
    		   evenCount++;
    	   }else {
    		   oddCount++;
    	   }
    	   num=num/10;
       }
       System.out.println("Number of Even digits are " +evenCount);
       System.out.println("Number of odd digits are " +oddCount);
	}

}

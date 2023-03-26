package programs_Practice;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s1 = new Scanner(System.in);
      System.out.println("Enter a Number");
      int num = s1.nextInt();
      
      int org_num = num;
      
      int rev = 0;
      while(num!=0) {
    	  rev = rev*10 + num%10;
    	  num=num/10;
      }
      
      if (org_num==rev) {
    	  System.out.println(org_num+" is Palindrome Number");
      }else {
    	  System.out.println(org_num+ " is not Palindrome Number");
      }
	}

}

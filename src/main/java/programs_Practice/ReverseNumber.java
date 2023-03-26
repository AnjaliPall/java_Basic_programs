package programs_Practice;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s1 = new Scanner(System.in);
      System.out.println("Enter the number to reverse");
      int num = s1.nextInt();
      
      //1. Using Algorithm
      int rev = 0;
      while(num!=0){
    	
    	  rev = rev*10 + num%10;
    	  num=num/10;
      }
      System.out.println("Reverse Number is :" +rev);
      
      //2. Using SringBuffer Class
      StringBuffer sb = new StringBuffer(String.valueOf(num));
      StringBuffer rev1 = sb.reverse();
      System.out.println("Reverse Number is:" +rev1);
      
      //3. Using StringBuilder Class
      StringBuilder sb1 = new StringBuilder();
      sb1.append(num);
      StringBuilder rev2 = sb1.reverse();
      System.out.println("Reverse Number is :" +rev2);
      }

}

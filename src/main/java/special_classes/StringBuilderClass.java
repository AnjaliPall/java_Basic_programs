package special_classes;

import java.util.Scanner;

public class StringBuilderClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      StringBuilder sb1 = new StringBuilder("Learning java");
       
      sb1.append(" is");
      sb1.append(" fun");
      
      System.out.println(sb1);
      
      Scanner s1 = new Scanner(System.in);
      System.out.println("Please Enter a string");
      String str1 = s1.nextLine();
      System.out.println(str1);
      
      //for reversing the string
      
      String temp = "";
       
      for(int i=0; i<= str1.length()-1; i++) {
    	  temp = str1.charAt(i) +temp;
      }
      System.out.println("Reversed String is: " + temp);
      
	}

}

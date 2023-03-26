package programs_Practice;

import java.util.Iterator;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str = "ABCDE";
       String rev = "";
       
       //1. Using Logic
//       int len = str.length();
//      for(int i=len-1;i>=0;i--) 
//      {
//    	  rev = rev + str.charAt(i);		
//	  }
//      System.out.println("reversed String is: " +rev);
       
      //2. Using Character Array
      char a[] = str.toCharArray();
      int len1 = a.length;
      for(int i=len1-1;i>=0;i--) {
    	  rev = rev +a[i];
      }
      System.out.println("reversed String is: " +rev);
      
      //3. Using StringBuffer Class
	}

}

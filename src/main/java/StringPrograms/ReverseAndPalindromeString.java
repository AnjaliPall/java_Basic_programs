package StringPrograms;

import java.util.Scanner;

public class ReverseAndPalindromeString {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the String");
        String s1 = s.nextLine();
        String rev = " ";
        
        int len = s1.length();
        for(int i= len-1;i>=0;i--) {
        	rev = rev + s1.charAt(i);
        }
        System.out.println("reversed string is " + rev);
        if(s1.equals(rev)) {
        	System.out.println("a palindrome String");
        }else
        	System.out.println("not a palindrome");		
	}

}

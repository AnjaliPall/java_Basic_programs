package StringPrograms;

import java.util.Scanner;

public class CountCharactersInaString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Strings of characters");
		String s1 = s.nextLine();             //what is the difference between next() and nextLine()
//		String s1 = "Learn Java";
		
		int count=0;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i) !=' ') {
				count++;
			}
		}
       System.out.println("no. of characters in the String are " +count);
	}

}

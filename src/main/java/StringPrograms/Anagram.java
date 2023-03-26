package StringPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		
	Scanner s = new Scanner(System.in);
	
	System.out.println("enter two strings");
	String str1 = s.nextLine();
	String str2 = s.nextLine();
	
	char arr1[] = str1.toCharArray();
	char arr2[] = str2.toCharArray();
	
	Arrays.sort(arr1);
	Arrays.sort(arr2);
	
	String sortedstr1 = new String(str1);
	String sortedstr2 = new String(str2);
	
	if(sortedstr1.equals(sortedstr2)) {
		System.out.println("anagram");
	}else {
		System.out.println("not an anagram");}
	}

}

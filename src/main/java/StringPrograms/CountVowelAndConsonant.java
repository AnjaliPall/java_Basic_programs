package StringPrograms;

import java.util.Scanner;

public class CountVowelAndConsonant {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		String s1 = s.nextLine();
		
		s1 = s1.toLowerCase();
		int con=0,vow=0;
		int len = s1.length();
		
		for (int i=0;i<len;i++) {
			
			char c= s1.charAt(i);
			if(c!=' ') {
				if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
					vow++;
				}else
					con++;
			}
		}
		System.out.println("number of vowels " +vow+ " number of consonant " +con);
	}	
}

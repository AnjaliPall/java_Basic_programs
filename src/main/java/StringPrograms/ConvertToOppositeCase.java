package StringPrograms;

public class ConvertToOppositeCase {

	//converting lowercase char to uppercase and viceversa with inbuilt functions
	public static void Convert(StringBuffer str) {
		int length = str.length();
		
		for (int i=0;i<length;i++) {
			Character c = str.charAt(i);
			
			if(Character.isLowerCase(c)) {
				str.setCharAt(i, Character.toUpperCase(c));
			}else {
				str.setCharAt(i, Character.toLowerCase(c));
			}				
		}
		System.out.println("String is: " +str);
	}
	
	//converting lowercase char to uppercase and viceversa with ASCII code or without functions
	public static void ConvertTo(StringBuffer str1) {
		int len = str1.length();
		
		 for (int i=0; i<len; i++) {
			 Character c= str1.charAt(i);
			 //lower case c:c-32 =>uppercase
			 //upper case c:c+32 =>lowercase
			 if(Character.isLowerCase(c)) {
				 char toUpperCase =(char)(c-32);
				 str1.setCharAt(i, toUpperCase);
			 }else {
				 char toLowerCase = (char)(c+32);
				 str1.setCharAt(i, toLowerCase);
			 }
		 }
		 System.out.println("After: " +str1);
	}
	
	
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("CloudTech");
		StringBuffer str1 = new StringBuffer("HorLickS");
		Convert(str);
		ConvertTo(str1);
	}

}

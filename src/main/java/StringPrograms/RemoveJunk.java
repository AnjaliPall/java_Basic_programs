package StringPrograms;

public class RemoveJunk {

	public static void main(String[] args) {
		
		String s= "#%$^)(*%%$!#$%^?|><&^%$#@!@#$% latin String 0123456";
		
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("after: " +s);

	}

}

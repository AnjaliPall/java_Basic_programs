package StringPrograms;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String str = "Java programming Selenium Automation";
		System.out.println("Before: " +str);
		
		str = str.replaceAll("\\s", ""); //with function replaceAll
		
		System.out.println("after: " +str);

	}

}

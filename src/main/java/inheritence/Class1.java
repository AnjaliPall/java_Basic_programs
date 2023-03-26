package inheritence;

public class Class1 {
       
	public int num1;
	public int num2;
	
	public void addition(int num1, int num2) {
		System.out.println("The Addition of the numbers is: " +(num1+num2));
	}

	public Class1(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		System.out.println("This is the parent class");
	}
	
}

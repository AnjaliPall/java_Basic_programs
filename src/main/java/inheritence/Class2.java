package inheritence;

public class Class2 extends Class1 {
	
   public Class2(int num1, int num2) {
		super(num1, num2);
		System.out.println("This is the child class");
	}

   public void doSubtraction(int num1 ,int num2) {
	   System.out.println("The Subtraction of the numbers is: " + (num1-num2));
	   
   }
}

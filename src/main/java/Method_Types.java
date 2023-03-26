
public class Method_Types {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Method_Types x = new Method_Types();
		x.dothis();
		x.addition(100,150);
		int p = x.muntiply(20, 30);
		System.out.println(p); 
		
	}
      public void dothis() {
    	  System.out.println("just testing the method");
      }
      
      public void addition(int num1,int num2) {
    	  System.out.println(num1+num2);
      }
      
      public int muntiply(int a,int b) {
    	  int c = a*b;
    	  return c;
      }
}

package programs_Practice;

public class Swapping2Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a=10, b=20;
      System.out.println("Before Swapping Values are" +a+ "  " +b);
       
//      Logic1: Third variable
      
         int t=a;
         a=b;
         b=t;
         System.out.println("After Swapping Values are" +a+ "  " +b);
        
//         Logic2: use + & - without using third variable
          a=a+b;
          b=a-b;
          a=a-b;
          System.out.println("After Swapping Values are" +a+ "  " +b);
          
	}

}

package programs_Practice;

import java.util.Scanner;

public class LargestOf3Numbers {

	public static void main(String[] args) {
		
     Scanner s1 = new Scanner(System.in);
     
     System.out.println("Enter the first number a:");
     int a =s1.nextInt();
     
     System.out.println("Enter the Second number b:");
     int b =s1.nextInt();
     
     System.out.println("Enter the Third number c:");
     int c =s1.nextInt();
    
     //1. using Logic
     if(a>b && a>c)
    	 System.out.println(a+ " is the largest");
     if(b>a && b>c)
    	 System.out.println(b+ " is the largest");
     if(c>b && c>c)
    	 System.out.println(c+ " is the largest");
     
     //2. Using Ternary Operator
     int largest = a>b?a:b;
     int largest1 = c>largest?c:largest;
     
     System.out.println(largest1+ " is the largest number of all");
     
     
	}

}

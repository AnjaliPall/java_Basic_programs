
public class OOPS {

	public static void main(String[] args) {
		
     Student s1 = new Student();
     s1.Name = "Anjali";
     s1.age = 23;
     
     s1.personalInfo();
     
	}
}
class Pen{
	String color;
	String type;
	public void write() {
		System.out.println("Write something");
	}
	public void printColor() {
		System.out.println(this.color);
	}
	
}
class Student {
	String Name ;
	int age;
	
	public void personalInfo() {
		System.out.println(this.age);
		System.out.println(this.Name);
	}
	Student(){
		this.Name= Name;
		this.age = age;
	}
	
}

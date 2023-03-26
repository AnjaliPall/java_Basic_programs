package Oops_concepts;

public class Encap {
	private String sub1 = "maths";
	private int stdCount;
	
	public String getSub1() {
		return sub1;
	}
	public void setSub1(String sub1) {
		this.sub1 = sub1;
	}
	public int getSdtCount() {
		return stdCount;
	}
	public void setSdtCount(int stdCount) {
		this.stdCount = stdCount;
	}
	
	public void displayDetails() {
		System.out.println("This is a " + sub1 + " classroom and it has " + stdCount + " students");
	}
	
	

}


 class Bird {
	public void sing() {
		System.out.println("Tweek Tweek Tweek");
	}
}
 class Bird1 extends Bird{
	 public void sing() {
			System.out.println("Tweedle Tweedle Tweedle");
	} 
 }
 class OuterClass{
	int x=5;
       class InnerClass{
         int y= 8;	 
       }
 }
public class Poly {

	public static void main(String[] args) {
		Bird b = new Bird1();
		b.sing();
        
		OuterClass myOuter = new OuterClass();
		OuterClass.InnerClass myInner = myOuter.new InnerClass();
		System.out.println(myInner.y + myOuter.x);
	}

}


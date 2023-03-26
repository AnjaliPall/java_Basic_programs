
public class Loop_breakandContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a = 100;
        while(a>50) {
        	a-=5;
        	if (a==75) {
        		continue;
               //break;
        	}
        	System.out.println(a);
        }
	}

}

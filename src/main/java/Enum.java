
public class Enum {
	enum Level{
		LOW,
		MEDIUM,
		HIGH
	}

	public static void main(String[] args) {
	Level myVar = Level.MEDIUM;
	System.out.println(myVar);
	
	Level myVar1 = Level.HIGH;
	switch(myVar1) {
	case LOW:
		System.out.println("LOW Level");break;
	case MEDIUM:
		System.out.println("MEDIUM Level");break;
	case HIGH:
		System.out.println("HIGH Level");break;	
	}

	}

}

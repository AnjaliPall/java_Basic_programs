import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
	HashSet<Integer> numbers = new HashSet<Integer>();
	
	numbers.add(3);
	numbers.add(8);
	numbers.add(9);
	numbers.add(5);
	
	for(int i=1;i<10;i++) {
		if(numbers.contains(i)) {
			System.out.println(i+ " is in the set");
		}else {
			System.out.println(i+ " is not in the set");
		}
	}
	}

}

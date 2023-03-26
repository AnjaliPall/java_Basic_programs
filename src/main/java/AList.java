import java.util.ArrayList;

public class AList {

	public static void main(String[] args) {
		ArrayList<String> cars  = new ArrayList<String>();
		cars.add("volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		cars.add("Dunzo");
		cars.add("Doctor");
		for(String i: cars) {
		System.out.println(i);
		}
		System.out.println(cars.get(3));
		System.out.println(cars.set(2, "Audi"));
		System.out.println(cars.remove(5));
		System.out.println(cars.indexOf("Dunzo"));
		
		for(String i: cars) {
			System.out.println(i);
			}
		
		

	}

}

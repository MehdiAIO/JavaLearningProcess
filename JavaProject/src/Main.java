import java.util.ArrayList;

public class Main{
	public static void main(String[] args){

		// for-each = 	traversing technique to iterate through the elements in an array/collection

		//				less steps, more readable

		//				less flexible
		
//		String[] cars = {"Mazeratti","Tesla","Ford"};
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Lambo");
		cars.add("Porshe");
		cars.add("Audi");

		for(String i : cars) {
			System.out.println(i);
		}
		
	}
}
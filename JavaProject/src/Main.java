
public class Main {

	public static void main(String[] args) {
		String x = "water";
		String y = "orange juice";
		String empty;
		
		empty = x;
		x = y;
		y = empty;
		
		System.out.println("x: "+x);
		System.out.println("y: "+y);
	}
	
}
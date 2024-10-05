import java.util.Random;
public class Main{
	public static void main(String[] args){
		
		Random random = new Random();
		
//		int x = random.nextInt(); // generate a number between -x & +x
//		int x = random.nextInt(6); // generate a number >= 0 & <6
//		int x = random.nextInt(6)+1; // generate a number >= 0 & <=6
//		double x = random.nextDouble(); // generate a number > 0 & <1
		boolean x = random.nextBoolean(); // true or false 
		
		System.out.println(x);
		
	}
}
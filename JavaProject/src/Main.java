
public class Main {

	public static void main(String[] args) {
		// the integer variable can't be longer than 10 
		int x; // declaration
		x = 1; // assignment
		System.out.println(x);
		
		int y = 2; // initialization
		System.out.println(x+y);
		
		/* that why we use long variable in case our variable will contain a big number has 
		 * an 19 character or less but this variable got to have a L letter in the end
		 */
		long z = 1218288000000000000L;
		System.out.println(z);
		
		/*  we use float data type to store decimal portion & it got to end with 
		 *  a common assignment which it is f
		 */
		float a = 5.50f;
		float b = 4.50f;
		System.out.println(a+b);
		
		/*
		 * or you can you double instead
		 */
		double c = 10.05;
		System.out.println(c);
		
		/*
		 * boolean type only accept true or false
		 */
		boolean t = true;
		System.out.println(t);
		
		/*
		 * char type can't hold more than 1 character
		 */
		char ch = '@';
		System.out.println(ch);
		
		/*
		 * string type able to store more than 1 character
		 */
		String st = "mehdi";
		System.out.println("my name is "+st);
	}
	
}
public class Main {

	public static void main(String[] args) {

		boolean myBoolean = true;
		char myChar = '@';
		String myString = "Mehdi";
		int myInt = 7;
		double myDouble = 10.00;
		
//		Conversion characters
		System.out.printf("%b",myBoolean);
		System.out.printf("\n%c",myChar);
		System.out.printf("\n%s",myString);
		System.out.printf("\n%d",myInt);
		System.out.printf("\n%f",myDouble);
	
//		Width
		System.out.printf("\nBonjour %10s",myString);
		System.out.printf("\nBonjour %-10s",myString);
		
//		Precision
		System.out.printf("\nvotre montant d'argent : %.2f",2000.109827);
	}	

}
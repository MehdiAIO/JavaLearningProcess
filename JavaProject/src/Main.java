import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		
//	Mathematical formula : a² + b² = c²
		
	double a;
	double b;
	double c;	
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("enter \"a\" value");
	a = scanner.nextDouble();
	System.out.println("enter \"b\" value");
	b = scanner.nextDouble();
	
	c = Math.sqrt((a*a)+(b*b));
	
	System.out.println("the hypotenuse of triangle is : "+c);
		
	}
}
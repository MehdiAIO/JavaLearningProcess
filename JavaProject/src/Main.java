// import scanner using java utility package
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("whats your name");
		String name = scanner.nextLine();
		System.out.println("type your age");
		int age = scanner.nextInt();
		
		/* 
		 * to prevent the issue of escaping the new line we got to make it empty before 
		 * prompting again
		 */
		
		scanner.nextLine();

		System.out.println("whats your fav food");
		String food = scanner.nextLine();
		
		System.out.println("Good Morning "+name);
		System.out.println("you have "+age+" years old");
		System.out.println("your fav food is "+food);
		
	}
	
}
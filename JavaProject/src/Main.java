import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Press q or Q to quit the game");
		String response = scanner.next();
		
		if(!response.equals("q") && !response.equals("Q")) {
			System.out.println("Still in the game");
		}
		else {
			System.out.println("You quit the game");
		}
		
	}
}
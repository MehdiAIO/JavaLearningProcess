import java.util.ArrayList;

public class Main{
	public static void main(String[] args){
		
//		ArrayList = resizable array
		ArrayList<String> players = new ArrayList<String>();
		
		players.add("Alexander Isak");
		players.add("Joao Pedro");
		players.add("Cole Palmer");
		
		for(int i = 0; i < players.size(); i += 1) {
			System.out.println(players.get(i));
		}
		
	}
}
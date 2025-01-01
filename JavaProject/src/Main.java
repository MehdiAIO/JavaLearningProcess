public class Main{
	public static void main(String[] args){
		// Assigning variables 
//		String[][] cars = {{"Camaro","AMG","Mclaren"},{"Mustang","Ford","Audi"},{"KIA","Austin Martin","Mazeratti"}};
		
		String[][] cars = new String[3][3];
		
		cars[0][0] = "Camaro";
		cars[0][1] = "AMG";
		cars[0][2] = "Mclaren";
		cars[1][0] = "Mustang";
		cars[1][1] = "Ford";
		cars[1][2] = "Audi";
		cars[2][0] = "KIA";
		cars[2][1] = "Austin Martin";
		cars[2][2] = "Mazeratti";
		
		for(int i = 0; i<cars.length;i++) {
			System.out.println();
			for(int j = 0; j<cars[i].length;j++) {
				System.out.print(cars[i][j]+' ');
			}
		}

		
	}
}
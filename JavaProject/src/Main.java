// import JOption tool 
import javax.swing.JOptionPane;

public class Main{
	public static void main(String[] args){
		
		String name = JOptionPane.showInputDialog("what's your name");
		JOptionPane.showMessageDialog(null, name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("type your age"));
		JOptionPane.showMessageDialog(null, age);
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("how long is your height"));
		JOptionPane.showMessageDialog(null, height+" cm");
		
	}
}
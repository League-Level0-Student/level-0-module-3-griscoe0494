package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class OwnAdventure {
	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Little Red Riding Hood went to explore the");
		String place = JOptionPane.showInputDialog(null,"Did she explore the woods or the canyon?");
		if(place.equals("woods")) {
			JOptionPane.showMessageDialog(null,  "She ran into a wolf!");
		 	String Input = JOptionPane.showInputDialog(null, "Did she run home or run to the town?");
		if(Input.equals("home")) {
			JOptionPane.showMessageDialog(null,  "She made it safely home.");
			if(Input.equals("town")) {
				JOptionPane.showMessageDialog(null,  "She did not make it to town.");
			}
		}
		}
		
		if(place.equals("canyon")) {
			JOptionPane.showMessageDialog(null,  "She found lost hikers and traveled home.");
		}
}
}
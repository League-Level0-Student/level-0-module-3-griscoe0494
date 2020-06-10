package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class OwnAdventure {
	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Little Red Riding Hood went to explore the");
		String place = JOptionPane.showInputDialog(null,"Did she explore the woods or the canyon?");
		if(place.equals("woods")) {
			JOptionPane.showMessageDialog(null,  "She ran into the big bad wolf!");
		}
		if(place.equals("canyon")) {
			JOptionPane.showMessageDialog(null,  "She found lost hikers.");
		}
}
}
package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {

	public static void main(String[] args) {

		String Input = JOptionPane.showInputDialog(null, "Are you happy?");
		if (Input.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing.");
		}
		if (Input.equalsIgnoreCase("No")) {
			String Ans = JOptionPane.showInputDialog(null, "Do you want to be happy?");
			if (Ans.equals("yes")) {
				JOptionPane.showMessageDialog(null, "Change something.");
			}
			if (Ans.equals("no")) {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing.");
			}
		}

	}
}

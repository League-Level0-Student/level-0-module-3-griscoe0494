
package _01_else_if._3_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(5);
		
		// 2. Print out the random variable above
		System.out.println(random);
		// 11. Repeat steps 1 to 10 ten times
		for(int x=1; x<=10; x++) {
			// 1. Ask the user for a guess using a pop-up window, and save their response 
			String guess = JOptionPane.showInputDialog(null, "What is your guess?");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			int guessAsInt = Integer.parseInt(guess);
			// 5. if the guess is correct
				// 6. Win
			
			// use guessAsInt since it is an int number
			if(guessAsInt == random) {
				JOptionPane.showMessageDialog(null,  "Won");
				System.exit(0);
			}
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			// 7. if the guess is high
			if(guessAsInt > random) {
				JOptionPane.showMessageDialog(null, "The guess was too high");
			}
				// 8. Tell them it's too high
			// 9. if the guess is low
				// 10. Tell them it's too low
			if(guessAsInt < random) {
				JOptionPane.showMessageDialog(null, "The guess was too low");
			}
		}
		// 13. Tell them they lose
		JOptionPane.showMessageDialog(null, "You lose.");
	}

}



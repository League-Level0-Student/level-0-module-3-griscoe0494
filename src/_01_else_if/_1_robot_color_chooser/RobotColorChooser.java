
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
	
		
		//1. Create a new Robot
		
		Robot r  = new Robot();
		for (int y=0; y<=5; y++) {
		r.penDown();
		r.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)		
		
		//3. Set the pen width to 10

		//4. Ask the user what color pen they would like the robot to draw with
		 String input = JOptionPane.showInputDialog(null, "What color would you like the robot to draw with?");
		//5. Use an if/else statement to set the pen color that the user requested
        if (input.equals("red")) {
        r.setPenColor(255,0,0);
        }
        else {
        	r.setRandomPenColor();
        }
		//6. If the user doesn't enter anything, choose a random color
        r.setSpeed(10);
        for (int x = 1; x <= 3; x++) {
		r.move(100);
		r.turn(120);
	}
		//7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		


		}
	}
     }


package _02_loop_variables._3_robot_walk_of_fame;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();
		
		// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.
		rob.setX(50);
		// 2. Make the robot draw a star shape. Hint: angle=144.
		for(int y=0; y<10; y++) {
		rob.penDown();
		rob.setSpeed(10);
		for(int x=0; x<5; x++) {
			rob.move(30);
			rob.turn(144);

		}
		rob.penUp();
		rob.turn(80);
		rob.move(50);
		}
		// 3. Set the length of each line in the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/RobotWalk
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}

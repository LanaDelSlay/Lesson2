package examples;

import org.jointheleague.graphical.robot.Robot;

public class IntroToRobot {
	public static void main(String[] args) {

		Robot r2d2 = new Robot();
		r2d2.penDown();
		r2d2.setPenWidth(5);
		r2d2.setSpeed(5);
		for (int i = 0; i < 4; i++) {
			r2d2.setRandomPenColor();
			for (int o = 0; o < 4; o++) {
				r2d2.move(150);
				r2d2.turn(90);
			}
			r2d2.turn(-90);
		}
	}
}

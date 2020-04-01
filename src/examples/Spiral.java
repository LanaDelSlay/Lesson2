package examples;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		Robot juneBot = new Robot("june");
		juneBot.penDown();
		juneBot.setSpeed(100);
		for (int i = 0; i < 75; i++) {
			juneBot.setRandomPenColor();
			juneBot.move(5*i);
			juneBot.turn(360/9); 
			juneBot.setPenWidth(i);
		}
	}
}

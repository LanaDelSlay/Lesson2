package exercises;

/*
 * Count down a rocket launch!
 * 
 * Print the numbers from 10 to 1, then print â€œblastoffâ€�. 
 */

public class NASACountdown {

	public static void main(String args[]) {
		int time = 10;
		System.out.println("T-Miuns " + (time) + " seconds");
		for(int i = 1; i <= 9; i++) {
			System.out.println((time - i) + " seconds");
		}
		
		System.out.println("BLAASST OFFF!!"); 
		
	}
	

	
	}

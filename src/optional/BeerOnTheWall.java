package optional;

/* 
 * Print the lyrics to the song "99 Bottles of Beer on the wall"
 * 
 * http://99-bottles-of-beer.net/lyrics.html
 */

public class BeerOnTheWall {
		
	public static void main(String[] args) {
		
	for (int i = 99; i > 0; i--) {
		System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.");
		System.out.println("Take one down and pass it around, " + (i-1) + " bottles of beer on the wall.");
		System.out.println();
	}
		
	}
}

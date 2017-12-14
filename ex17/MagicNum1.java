import java.util.Random;
import java.util.Scanner;

public class MagicNum {
	public static void main (String args[]) {
		
		//play game
		do {
			playGame();
		}
	}

	public static void playGame() {
		
		// Create random number
		Random randomGenerator = new Random();
		int a = randomGenerator.nextInt(101);
		System.out.print("Guess the magic number (between 1 and 100): ");

		// Create a scanner object
		Scanner num = new Scanner(System.in);
		int guess = num.nextInt();

		
		// Guessing conditions
		if (guess < a) {
			System.out.println("too small");
		}
		else if (guess > a) {
			System.out.println("too big");
		}
		else {
			System.out.println("Bingo!");
		}
	}
}

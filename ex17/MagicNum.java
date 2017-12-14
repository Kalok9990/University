// at beginning of program
import java.util.Random;
import java.util.Scanner;

public class MagicNum {
	public static void main(String args[]) {
		while (GuessingGame.play) {
			GuessingGame.play();
		}
	}
}

public class GuessingGame {
	public static boolean main(String args[]) {
	//random number
	Random randomGenerator = new Random();
	int randomInt = randomGenerator.nextInt(101);
	Scanner num = new Scanner(System.in);
	int guess = num.nextInt();
	boolean win == false;
	//conditions
	while (win == false) {
		if (guess == randomInt) {
			win = true;
		}
		else if (guess < randomInt) {
			System.out.println("too small");
		}
		else {
			System.out.println("too big");
		}
	}
	System.out.println("Bingo!");
	}
}

	

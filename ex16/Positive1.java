import java.util.Scanner;

public class Positive {
	public static void main (String args[]) {
		// Create a Scanner object
		Scanner num = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		String s = num.next();
		double n = 0.0;

		// if not a number
		try {
			n = num.nextDouble();
		} catch (NumberFormatException ex) {
		System.out.println("Must be a number.");
		System.err.println("Caught NumberFormatException: " + ex.getMessage());
		}
		// if positive, request second value
		if (n > 0) {
			System.out.println("Enter a second value: ");
			double m = num.nextDouble();
			double sum = n - m;
			if (sum < 0) {
				double y = Math.abs(sum);
				System.out.println("The difference between the values is: " + y);
			}
			else {
				System.out.println("The difference between the values is: " + sum);
			}
		}
		
		// if negative, print positive equivalent
		if (n < 0) {
			double x = Math.abs(n);
			System.out.println(x);
		}	
	}
}

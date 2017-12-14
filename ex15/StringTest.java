import java.util.Scanner;

public class StringTest {
	public static void main (String args[]) {

		// Create a Scanner object
		Scanner reader = new Scanner(System.in);
		System.out.print("Please enter a string: ");
		String s = reader.nextLine();
		String sUpper = s.toUpperCase();
		String sLower = s.toLowerCase();
		char first = s.charAt(0);
		char last = s.charAt(s.length()-1);
		System.out.println("The string is: " + s);
		System.out.println("The length of the string is: " + s.length());
		System.out.println(sUpper);
		System.out.println(sLower);
		System.out.println("The first letter is: " + first);
		System.out.println("The last letter is: " + last);
		System.out.println(s.replaceAll(" ", ""));
	}
}
		
		

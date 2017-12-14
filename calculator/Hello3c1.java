import java.util.Scanner;

public class Hello3c1 {
	
	public static void main (String args[]) {
		
		// Create a Scanner object
		Scanner reader = new Scanner(System.in);

		// Read First name
		System.out.print("Enter your first name: ");
		String first = reader.next();
		if (!checkLength (first)) {
			System.out.println("This is not valid. Please try again.");
			System.exit(0);
		} 

		//Read Last name
		System.out.print("Enter your last name: ");
		String last = reader.next();
		if (!checkLength (last)) {
			System.out.println("This is not valid. Please try again.");
			System.exit(0);
		}

		// Read e-mail
		System.out.print("Enter your e-mail: ");
		String email = reader.next();
		if (!checkEmail (email)) {
			System.out.println("This is not valid. Please try again.");
			System.exit(0);
		}

		System.out.println("Hi " + first + "!");
		System.out.println("Your e-mail address is: " + email);
	}
	
	public static boolean checkLength(String str) {
		
		return str.length() >= 3;
	}
		
	public static boolean checkEmail(String str) {
		
		return (str.indexOf("@") > -1) && (str.indexOf(".") > -1);
	}
}
	

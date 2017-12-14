import java.util.Scanner;
	
public class Password {

	public static void main(String args[]) {

		// Create a Scanner object
		Scanner reader = new Scanner(System.in);

		//Read username
		System.out.println("Enter Username: ");
		String username = reader.next();

		//Read password
		System.out.println("Enter password: ");
		String password = reader.next();

		if (checkAccess(username, password) == true) {
			System.out.println("Access granted!");
		}
		else {
			System.out.println("Wrong username/ password.");
		}
	}
	
	public static boolean checkAccess(String username, String password) {
		
		if (username.equals("user42") && password.equals("pass42")) {
			return true;
		}		
		else {
			return false;
		}
	}
}

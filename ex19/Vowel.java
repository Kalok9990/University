import java.util.Scanner;

public class Vowel{
	
	public static void main(String args[]){
		String a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a sentence: ");
		a = sc.nextLine();
		a = a.toLowerCase();

		int VowelCount = 0;
		for (int i = 0; i < a.length(); i++) {
			switch(a.charAt(i)) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
				VowelCount++;
				break;
			default:
			}
		}
		System.out.println("The number of vowels is: " +VowelCount);
	}
}
	

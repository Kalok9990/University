import java.util.Scanner;

public class Vowel1{
	
	public static void main(String args[]){
		String a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a sentence: ");
		a = sc.nextLine();
		a = a.toLowerCase();

		int count = 0;
                int vowels = 0;
                int consonants = 0;
                for (int i = 0; i < a.length(); i++){

                        char ch = a.charAt(i);
                        if (ch == 'a' || ch == 'e' || ch == 'i' || 
                                        ch == 'o' || ch == 'u') {
                                vowels++;
                        }
                        else
                        { 
                                consonants++;
                        }
			int sum = a.length() - consonants;

		}
		System.out.println("The number of vowels is: " + sum;
	}
}

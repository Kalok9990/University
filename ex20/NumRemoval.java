import java.util.Scanner;

public class NumRemoval{
	
	public static void main(String args[]){
		String a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a sentence(include numbers): ");
		a = sc.nextLine();
		
		a = new String(a.replaceAll("[0-9]", ""));
		StringBuilder Sentence = new StringBuilder();

		for (int i = 0; i < a.length(); i++){
			char c = a.charAt(i);
			if(Character.isUpperCase(c)){
				Sentence.append(Character.toLowerCase(c));
			}
			else{
				Sentence.append(Character.toUpperCase(c));
			}
		}
		System.out.println(Sentence);
	}
}
			
				

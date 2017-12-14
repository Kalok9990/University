public class Multiplication {
	public static void main (String args[]) {
		for (int i= 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				int mult = i*j;
				if (mult < 10) {
					System.out.print(" ");
				}
				System.out.print(mult + " ");
			}
		System.out.println();
		}
	}
}
		

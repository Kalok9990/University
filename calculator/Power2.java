public class Power2 {
	public static void main (String args[]) {
		double result = pow(5.4, 2) + pow(2, 3) + pow(5.5, 3);
		System.out.println("The result is: " + result);
	}
	
	public static double pow (double base, int exponent) {
		double result = 1.0;
		for (int i = 0; i < exponent; i++) {
			result = result * base;
		}
		return result;
	}
}
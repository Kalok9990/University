public class Power1 {
	public static void main (String args[]) {
		long result = pow(4, 4) + pow(2, 3) + pow(5, 10);
		System.out.println("The result is: " + result);
	}
	public static long pow(int base, int exponent) {
		long result = 1;
		for (int i = 0; i < exponent; i++) {
			result = result * base;
		}
		return result;
	}
}

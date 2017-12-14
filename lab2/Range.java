public class Range {
	public static void main(String args[]){
		int lower = Integer.parseInt(args[0]);
		int upper = Integer.parseInt(args[1]);
		int sum = 0;
		if (lower < upper) {
			for (int i = lower; i <= upper; i++) {
			sum = sum +i;
			System.out.println("The sum is: " +sum);
			}
		} else {
			System.out.println("WRONG");
		}
	}
}

public class range {

	public static void main (String args[]){

		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
		int sum = 0;
		if (i < j) {
			for (int x = i; x <= j; x++){
				sum = sum + x;
				System.out.println("The sum is " + sum);
			}
		}else {
			System.out.println("This is wrong!");
		}
	}
}

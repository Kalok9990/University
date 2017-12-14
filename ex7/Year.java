public class Year{
	public static void main (String args[]){
	double year = Double.parseDouble(args[0]);
		if ((year % 4) == 0 && (year % 400) == 0 ! (year % 100) == 0){
			System.out.println("This year is a leap year.");
		}else 
			System.out.println("This is not a leap year.");
	}
}

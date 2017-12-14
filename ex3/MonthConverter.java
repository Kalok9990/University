public class MonthConverter{
	public static void main (String args[]){
		String[] Months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		int month = Integer.parseInt(args[0]);		
		System.out.println("Month " +month+ " is "+Months[month-1]);
	}
}

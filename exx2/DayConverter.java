public class DayConverter{
	public static void main (String args[]){
		String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		int day = Integer.parseInt(args[0]);		
		System.out.println(days[day-0]);
	}
}

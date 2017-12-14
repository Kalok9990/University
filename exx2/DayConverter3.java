public class DayConverter3{
	public static void main (String args[]){
	int day = Integer.parseInt(args[0]);
	switch (day) {
		case 1: case 8: case 15: case 22: case 29: 
		System.out.println("The day on " +args[0]+ " of October is Tuesday.");
		break;
		case 2: case 9: case 16: case 23: case 30: 
		System.out.println("The day on " +args[0]+ " of October is Wednesday.");
		break;
		case 3: case 10: case 17: case 24: case 31: 
		System.out.println("The day on " +args[0]+ " of October is Thursday.");
		break;
		case 4: case 11: case 18: case 25: 
		System.out.println("The day on " +args[0]+ " of October is Friday.");
		break;
		case 5: case 12: case 19: case 26: 
		System.out.println("The day on " +args[0]+ " of October is Saturday.");
		break;
		case 6: case 13: case 20: case 27: 
		System.out.println("The day on " +args[0]+ " of October is Sunday.");
		break;
		case 7: case  14: case 21: case 28: 
		System.out.println("The day on " +args[0]+ " of October is Monday.");
		break;
		
		}
	}
}

public class BMI{
	public static void main (String args[]){
	double weight = Double.parseDouble(args[0]);
	double height = Double.parseDouble(args[1])/100;
	double BMI = weight/(height*height);

	System.out.println("Your weight:" +args[0]+ "kg");
	System.out.println("Your height:" +args[1]+ "cm");		
	System.out.println("Your BMI:" +BMI);
		if (BMI < 18.5) {
			System.out.println("You are in the underweight range");
		} 
		else if (BMI < 25) {
			System.out.println("You are in the normal range");
		} 
		else if (BMI < 30) {
			System.out.println("You are in the overweight range");
		} 
		else if (BMI >= 30) {
			System.out.println("You are in the obese range");
		}	
}
}

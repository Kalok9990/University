public class MyCircle{
	public static void main (String args[]){
		double radius = Double.parseDouble(args[0]);	
		double PI = 3.1415926;
		double circumference = 2*radius*PI;
		double area = 4*radius*radius*PI;
		System.out.println("The radius of the circle is " +radius+ " cm");
		System.out.println("Its circumference is " +circumference+ " cm");
		System.out.println("And its area is " +area+ " cm^2");
	}
}

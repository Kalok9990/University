/**
 * A test class that uses the Circle class
 * @author laurissa
 *
 */
public class CircleTest {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.setColour("orange");
		c.setRadius(3);
		Circle c2 = new Circle();
		c2.setColour("blue");
		c2.setRadius(1);
		Circle c3 = new Circle();
		c3.setColour("red");
		c3.setRadius(2);
		Circle c4 = new Circle();
		c4.setColour("yellow");
		c4.setRadius(4);
		
		
		//ALL ADDED CODE MUST BE ABOVE THIS LINE
		Circle.displayMyCircles();
	}

}

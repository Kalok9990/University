public class SquareTest {
	public static void main(String[] args) {
		Square square1 = new Square();
		square1.x = 5;
		System.out.println(square1.SquareIt());
		
		Square square2 = new Square();
		square2.x = 29;
		square2.SquareIt();
		System.out.println(square2.SquareIt());
	}
}

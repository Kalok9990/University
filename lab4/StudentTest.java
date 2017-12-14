public class StudentTest {
	public static void main(String[] args) {
		Student student1 = new Student();
		
		student1.name = "John Smith";
		student1.gender = "Male";
		student1.yearOfBirth = 1985;
		student1.register();

		Student student2 = new Student();
		student1.name = "Ka Lok Cheung";
		student1.gender = "Male";
		student1.yearOfBirth = 1994;
		student1.register();
	}
}

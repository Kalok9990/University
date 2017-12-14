import java.util.ArrayList;

public class ListGrades{
	public static void main(String[] args){

		ArrayList<Integer> Grades = new ArrayList<Integer>();
		int x = 0;
		char Grade = 'F';
		for(int i=0; i<args.length; i++){
			Grades.add(Integer.parseInt(args[i]));
				int s = Grades.get(i);
				if(s >= 70){
					Grade = 'A';
				}
				else if(s >= 60){
					Grade = 'B';
				}
				else if(s >= 55){
					Grade = 'C';
				}
				else if(s >= 50){
					Grade = 'D';
				}
				else{
					Grade = 'F';
				}
			System.out.println("Student " +x+ " score is " +s+ " and grade is " +Grade+ ".");
			x++;
		}
	}
}

		

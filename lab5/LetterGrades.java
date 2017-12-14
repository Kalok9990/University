import java.util.ArrayList;

public class LetterGrades{

	public static void main(String[] args){

		int x = 0;
		char Grade = 'F';
		for(String score : args){
			int i = Integer.parseInt(score);
			if(i >= 70){
				Grade = 'A';
			}
			else if(i >= 60){
				Grade = 'B';
			}
			else if(i >= 55){
				Grade = 'C';
			}
			else if(i >= 50){
				Grade = 'D';
			}
			else{
				Grade = 'F';
			}
		System.out.println("Student " +x+ " score is " +i+ " and grade is " +Grade+ ".");
		x++;
		}
	}
}
			

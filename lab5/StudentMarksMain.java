import java.util.Arrays;
import java.util.Scanner;

public class StudentMarksMain{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		//Inout marks
		System.out.println("Please input the marks: ");
		double marks = sc.nextInt();
		StudentMarks sm = new StudentMarks();
		
		//Store in array
		sm.getMark();
		marks.setMark();
		
		
		//mean of marks
		marks.Mean();
	}
}	
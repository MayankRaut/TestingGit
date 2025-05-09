package controlStatement;

public class MarkingIfElseIfStatement {
	public static void main(String[] args) {
		MarkingIfElseIfStatement gradeCalling = new MarkingIfElseIfStatement();
		char grade = gradeCalling.getGrades(35);
		System.out.println(grade);
	}
	public char getGrades(int marks)
	{
		if(marks>=50&&marks<50){
			return 'D';
		} else if (marks>=60&&marks<70){
			return 'C';
		} else if (marks>=70&&marks<80){
			return 'D';
		} else if(marks>=80){
			return 'A';
		} else
		{
			return '0';
		}
	}
}
package methods;

public class NonStaticMethod {
	public static void main(String[] args) 
	{
		NonStaticMethod methodCalling = new NonStaticMethod();
		methodCalling.dGrade();
		methodCalling.cGrade();
		methodCalling.bGrade();
		methodCalling.aGrade();
	}
	
	public void dGrade()
	{
		System.out.println("Grade of the student is = D");
	}
	
	public void cGrade()
	{
		System.out.println("Grade of the student is = C");
	}
	
	public void bGrade()
	{
		System.out.println("Grade of the student is = B");
	}
	
	public void aGrade()
	{
		System.out.println("Grade of the student is = A");
	}
}
package operator;

public class AssignmentOperator {
	public static void main(String[] args) 
	{
		int a = 10;
		int b;
		
		//assign operator
		//b gets value of a
		b=a;
		System.out.println("Assignment operator = " +b);
		
		//additional operator
		// b = b+a
		b+=a;
		System.out.println("Addition operator = " +b);
		
		//subtraction operator
		//b = b-a
		b-=a;
		System.out.println("Subtraction operator = " +b);
		
		//multiplication operator
		//b = b*a
		b*=a;
		System.out.println("Multiplication operator = " +b);
		
		//division operator
		//b = b/a
		b/=a;
		System.out.println("Division operator = " +b);
		
		//modulus operator
		//b = b%a
		b%=a;
		System.out.println("Modulus operator = " +b);
	}
}
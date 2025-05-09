package operator;

public class TernaryOperator {
	public static void main(String[] args) {
		
		//It’s a one-liner replacement for the if-then-else statement and is used a lot in Java programming.
		
		int a = 10;
		int b = 20;
		int c = (a<b)?b:a; //a is less than b and b=true and a=false and as b:a therefore b is printed
		int d = (a>b)?a:b; //a is greater than b and b=true and a=false and as b:a therefore b is printed
		System.out.println("Result-1 =" + c);
		System.out.println("Result-2 =" + d);
	}
}
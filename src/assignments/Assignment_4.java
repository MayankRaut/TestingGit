package assignments;

public class Assignment_4 {
	public static void main(String[] args) {
		Assignment_4 callingMethods = new Assignment_4();
		int addition = callingMethods.addition(20, 50);
		System.out.println("addition of two number is = "+addition);
		int subtraction = callingMethods.subtraction(231, 21);
		System.out.println("subtraction of two number is = "+subtraction);
		int multiplication = callingMethods.multiplication(22, 10);
		System.out.println("multiplication of two number is = "+multiplication);
		int division = callingMethods.division(22, 10);
		System.out.println("division of two number is = "+division);
		callingMethods.average(65, 78, 91, 86, 59);
	}
	public int addition (int a, int b)
	{
		int c = a+b;
		return c;
	}
	public int subtraction (int a, int b)
	{
		int c = a-b;
		return c;
	}
	public int multiplication (int a, int b)
	{
		int c = a*b;
		return c;
	}
	public int division (int a, int b)
	{
		int c = a/b;
		return c;
	}
	public void average (int marks1, int marks2, int marks3, int marks4, int marks5)
	{
		double sum = marks1+marks2+marks3+marks4+marks5;
		System.out.println("Sum of marks is = "+sum);
		double average = sum/5;
		System.out.println("Average of marks is = "+average);
	}
}
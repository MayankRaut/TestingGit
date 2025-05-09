package methods;

public class StaticMethod {
	
	int aa = 201;
	int bb = 501;

	public static void main(String[] args) 
	{
		StaticMethod.addition(10, 4);
		StaticMethod sub = new StaticMethod();
		StaticMethod.subtraction(4.2 , 9.4);
		StaticMethod.average();
		int cc = sub.aa + sub.bb;
		System.out.println("Addition of global variable is = "+cc);
	}
	
	public static int addition(float a, float b)
	{
		float c = a + b;
		System.out.println("Addition of two number is = " + c);
		int d = 10;
		System.out.println("non-returned value is = " + d);
		return d;
	}
	
	public static void subtraction(double e, double f)
	{
		double g = e - f;
		System.out.println("Subtraction of two number is = " + g);
	}
	
	public static void average()
	{
		double h = StaticMethod.addition(42, 64)*0.5;
		System.out.println("Average of two number is = " + h);
	}
}
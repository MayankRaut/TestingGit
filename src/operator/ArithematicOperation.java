package operator;

public class ArithematicOperation {
	
	public static void main(String[] args) 
	{
		ArithematicOperation arithematicCalling = new ArithematicOperation();
		arithematicCalling.addition(23, 15);
		arithematicCalling.subtraction(27, 12);
		arithematicCalling.divide(34, 2);
		arithematicCalling.multiplication(12, 42);
		arithematicCalling.modulus(12, 5);
	}
	
	public void addition(int a, int b)
	{
		int c = a+b;
		System.out.println("Addition of two integers is = " + c);
	}
	
	public void subtraction(int d,int e)
	{
		int f = d-e;
		System.out.println("Subtraction of two integers is = " + f);
	}
	
	public void multiplication(int g,int h)
	{
		int j = g*h;
		System.out.println("Multiplicaton of two integers is = " + j);
	}
	
	public void divide(int k, int l)
	{
		int m = k/l;
		System.out.println("Division of two integers is = " + m);
	}
	
	public void modulus(int n,int o)
	{
		int p = n%o;
		System.out.println("Modulus of two integers is = " + p);
	}
}
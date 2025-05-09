package assignments;

public class Assignment_2 {
	int y;
	public static void main(String[] args) {
		Assignment_2 callingDataType = new Assignment_2();
		callingDataType.printingPrimitiveDataType();
		callingDataType.printingFirstCharOfName();
		callingDataType.callingLocalVariable();
		System.out.println("Global variable = " + callingDataType.y);
	}
	public void printingPrimitiveDataType()
	{
		float a = 42.3f;
		double b = 131.221;
		byte c = 101;
		short d = 11111;
		int e = 1212231122;
		long f= 988288191;
		System.out.println("float value is = " + a);
		System.out.println("double value is = " + b);
		System.out.println("Byte value is = " + c);
		System.out.println("short value is = " + d);
		System.out.println("integer value is = " + e);
		System.out.println("long value is = "+f);
	}
	public void printingFirstCharOfName()
	{
		char g = 'M';
		System.out.println("First Char of my name is = "+g);
	}
	public void callingLocalVariable()
	{
		int x = 50;
		System.out.println("Calling local variable 'x' = " + x);
	}
}
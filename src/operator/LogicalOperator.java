package operator;

public class LogicalOperator {
	public static void main(String[] args) 
	{
		LogicalOperator logicalCalling = new LogicalOperator();
		logicalCalling.andOperator(2, 10);
		logicalCalling.orOperator(14, 7);
	}
	
	public void andOperator(int a, int b)
	{
		boolean c = a<b;
		boolean d = a!=b;
		System.out.println(c&&d);
	}
	
	public void orOperator(int e, int f)
	{
		boolean g = e>=f;
		boolean h = e!=f;
		System.out.println(g||h);
	}
}
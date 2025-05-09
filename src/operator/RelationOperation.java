package operator;

public class RelationOperation {
	public static void main(String[] args) 
	{
		RelationOperation relationCalling = new RelationOperation();
		relationCalling.equation(13, 13);
		relationCalling.notEqual(13, 12);
		relationCalling.lessThan(22, 12);
		relationCalling.greaterThan(51, 40);
		relationCalling.lessThanEqualTo(12, 11);
		relationCalling.greaterThanEqualTo(21, 21);
	}
	public void equation(int a,int b)
	{
		boolean c = a==b;
		System.out.println(c);
	}
	public void notEqual(int d, int e)
	{
		boolean f = d!=e;
		System.out.println(f);
	}
	public void lessThan(int g, int h)
	{
		boolean i = g<h;
		System.out.println(i);
	}
	public void greaterThan(int j, int k)
	{
		boolean l=j>k;
		System.out.println(l);
	}
	public void lessThanEqualTo(int m, int n)
	{
		boolean o=m<=n;
		System.out.println(o);
	}
	public void greaterThanEqualTo(int p, int q)
	{
		boolean r = p>=q;
		System.out.println(r);
	}
}
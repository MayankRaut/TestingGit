package operator;

public class BitwiseOperator {
	public static void main(String[] args) {
		BitwiseOperator.bitwiseAndOperator(-10, -20, -5);
		BitwiseOperator.bitwiseOrOperator(-10, -20, -5);
	}
	
	// Bitwise And = &
	public static void bitwiseAndOperator(int a, int b, int c)
	{
		System.out.println((a<b)&(a<c));
	}
	
	//Bitwise Or = |
	public static void bitwiseOrOperator(int a, int b, int c)
	{
		System.out.println((a<b)|(a<c));
	}
}
package operator;
public class UnaryOperator {
	public static void main(String[] args) {
		int b = 100;
		System.out.println(b++);//100
		System.out.println(++b);//102
		System.out.println(b--);//102
		System.out.println(--b);//100
	}
}
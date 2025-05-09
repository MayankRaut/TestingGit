package operator;

public class InstanceOperator {
	public static void main(String[] args) {
		String a = "Mayank";
		boolean result;
		result = a instanceof String;
		System.out.println(result);
		
		InstanceOperator op = new InstanceOperator();
		result = op instanceof InstanceOperator;
		System.out.println(result);
	}
}
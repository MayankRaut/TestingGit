package encapsulation;

public class Class2 {
	public static void main(String[] args) {
		Class1 transactions = new Class1("Mayank", 211234412, 0);
		transactions.deposit(97881.83);
		transactions.withdraw(514);
		transactions.withdraw(70);
		transactions.withdraw(1480);
		transactions.withdraw(1100);
		transactions.withdraw(60);
		transactions.withdraw(20);
		transactions.withdraw(249);
		double balance = transactions.getBalance();
		System.out.println(balance);
	}
}
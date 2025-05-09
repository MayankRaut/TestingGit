package encapsulation;

public class Class1 {
	private String name;
	private double accountNumber;
	private double balance;
	
	public Class1 (String name, double accountNumber, double balance)
	{
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	 public String getName ()
	 {
		 return this.name;
	 }
	 public double getAccountNumber ()
	 {
		 return this.accountNumber;
	 }
	 public double getBalance()
	 {
		 return this.balance;
	 }
	 public void deposit (double money)
	 {
		 if(money > 0)
		 {
			 balance+=money;
			 System.out.println(money + " :: Money has be deposited");
		 }
		 else
		 {
			 System.out.println("Invalid Input!!!");
		 }
	 }
	 public void withdraw (double money)
	 {
		 if(money>0 && money<=balance)
		 {
			 balance -=money;
			 System.out.println(money + " :: Money has be withdrawn");
		 }
		 else
		 {
			 System.out.println("Invalid Input!!!");
		 }
	 }
}
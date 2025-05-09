package inheritance;

public class ChildClass extends ParentClass{
	
	public ChildClass(String name, int employeeId, String deskNumber)
	{
		super.setName(name);
		super.setEmployeeId(employeeId);
		super.setDeskNumber(deskNumber);
	}
	
	public static void main(String[] args) {
		ChildClass cs = new ChildClass("Mayank", 1302, "FrontLeftEnd");
		cs.displayEmployeeInformation();
	}
}
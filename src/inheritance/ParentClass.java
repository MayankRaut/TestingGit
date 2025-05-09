package inheritance;

public class ParentClass {
	private String name;
	private int employeeId;
	private String deskNumber;
	
	public ParentClass(String name, int employeeId, String deskNumber)
	{
		this.name = name;
		this.employeeId = employeeId;
		this.deskNumber = deskNumber;
	}
	public ParentClass()
	{
		
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getEmployeeId()
	{
		return this.employeeId;
	}
	public void setEmployeeId(int employeeId)
	{
		this.employeeId = employeeId;
	}
	public String getDeskNumber()
	{
		return deskNumber;
	}
	public void setDeskNumber(String deskNumber)
	{
		this.deskNumber=deskNumber;
	}
	public void displayEmployeeInformation()
	{
		System.out.println("Employee Name is :: "+name);
		System.out.println("Employee Id is :: "+employeeId);
		System.out.println("Employee desk number is :: "+deskNumber);
	}
}
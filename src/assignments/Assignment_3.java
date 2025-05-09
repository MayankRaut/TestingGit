package assignments;

public class Assignment_3 {
	public static void main(String[] args) {
		Assignment_3 callingStudentName = new Assignment_3();
		callingStudentName.getStudentName("Mayank Purushottam Raut");
	}
	public String getStudentName (String name)
	{
		System.out.println("Student Name is = " + name);
		return name;
	}
}

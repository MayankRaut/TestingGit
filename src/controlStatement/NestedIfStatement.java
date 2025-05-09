package controlStatement;

public class NestedIfStatement {
		public static void main(String[] args) {
			NestedIfStatement floor = new NestedIfStatement();
			floor.fetchingShoppingFloor(17, 'F');
		}
		public void fetchingShoppingFloor(int age, char gender)
		{
			if(age>=18)
			{
				if('M'==gender)
				{
					System.out.println("Floor is 3rd");
				}
				else
				{
					System.out.println("Floor is 2nd");
				}
			}
			else
			{
				System.out.println("Floor is 1st");
			}
		}
}
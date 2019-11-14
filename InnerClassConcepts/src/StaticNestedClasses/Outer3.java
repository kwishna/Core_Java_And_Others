package StaticNestedClasses;

public class Outer3 {
	static int i=10;
	static class Inner{
	//	int i = 129;
		public static void main(String[] args) {
			System.out.println("Hey! I Am Inside Nested Inner Class ::: "+i);
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("I Am In The Outer Class");
	}
}

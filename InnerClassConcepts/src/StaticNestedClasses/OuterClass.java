package StaticNestedClasses;

public class OuterClass {	
	static class Inner{
		 int a = 5;
		 void method() {
			 System.out.println("Accessing Static Nested Class ::: "+a);
		 }
	}
	
	public static void main(String[] args) {	
		Inner i = new Inner();
		i.method();	
	}
}

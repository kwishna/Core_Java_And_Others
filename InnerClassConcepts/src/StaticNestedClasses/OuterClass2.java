package StaticNestedClasses;

class Outer1{	
	static class Inner1{	
		public void method() {
			System.out.println("Static Nested Class Accessing");
		}		
	}	
}
public class OuterClass2 {

	public static void main(String[] args) {	
		Outer1.Inner1 obj = new Outer1.Inner1();
		obj.method();
	}
}

package InnerClassOne;

public class Outer5 { // Modifier Allowed Here Are : public, <default>, final, abstract, strictfp
	int x = 10; // Instance 'x' Of Outer Class
	
	class Inner5{ // Modifiers Allowed Here : private, static, protected + All Outer Class Valid Modifier.
		int x = 100; // Instance 'x' Of Inner Class
		
		void printX() {	
			int x = 1000; // Local 'x' Of Breaking Method
			
			System.out.println("Local 'x' ::: "+x);
			System.out.println("Inner Class Instance 'x' ::: "+this.x);
			System.out.println("Again Inner Class Instance 'x' ::: "+Inner5.this.x);
			System.out.println("Outer Class Instance 'x' ::: "+Outer5.this.x);
		}
	}

	public static void main(String[] args) {	
		Outer5.Inner5 b = new Outer5().new Inner5();
		b.printX();
	}
}

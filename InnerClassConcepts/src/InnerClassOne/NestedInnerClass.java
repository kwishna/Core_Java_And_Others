package InnerClassOne;

public class NestedInnerClass {
	
	class Inner1{
		
		class InsideInner1{		
			void m1() {				
				System.out.println("Nested Inner Class ::: "+this.getClass().getName());
			}
		}
	}
	
	public static void main(String[] args) {
		
		NestedInnerClass outer = new NestedInnerClass();
		NestedInnerClass.Inner1 inner1 = outer.new Inner1();
		NestedInnerClass.Inner1.InsideInner1 innerInsideInner = inner1.new InsideInner1();
		innerInsideInner.m1();
	}
}

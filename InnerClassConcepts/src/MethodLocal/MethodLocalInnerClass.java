package MethodLocal;

public class MethodLocalInnerClass {
	
	class Inner3{
		public void mx() { // We Require A Method Inside This Method So That We Could Use That Many Times Inside This Method.
							// Since, Method Inside A Method Is Not Valid In Java. We Should Go For Class Inside A Method.		
			class MethodLocal{			
				public void sum(int a, int b) {
					System.out.println("The Sum Is ::: "+(a+b));
				}
			}	
			MethodLocal m = new MethodLocal();
			m.sum(10, 10);
			m.sum(100, 100);
			m.sum(1000, 1000);
			m.sum(10000, 10000);
			m.sum(100000, 100000);			
		}
	}
	
	public static void main(String[] args) {
		MethodLocalInnerClass.Inner3 inner = new MethodLocalInnerClass().new Inner3();
		inner.mx();
	}
}
package MethodLocal;

public class MethodLocalInner2 {
	
	int i = 10;
	static int x = 5;
	
	public void fun1() {
		
		int k = 20;
		class MethodLocal1{						
				public void m2() {	
					
					System.out.println("Accessing Instance Of Outer Class 'i' ::: "+i);
					System.out.println("Accessing Instance Of Outer Class 'x' ::: "+x);
					System.out.println("Accessing Instance Of Local Method 'p' ::: "+k);
				}
		}
		
		MethodLocal1 method1 = new MethodLocal1();
		method1.m2();
	}
	
	public static void fun2() {
		
		class MethodLocal2{						
				public void m3() {				
//					System.out.println("Accessing Instance Of Outer Class 'i' ::: "+i); // Can't Access Non-Static Member Of Outer Class
					System.out.println("Accessing Instance Of Outer Class 'x' ::: "+x);
				}
		}		
		MethodLocal2 method2 = new MethodLocal2();
		method2.m3();
	}
	
	public static void main(String[] args) {		
		new MethodLocalInner2().fun1();
		MethodLocalInner2.fun2();
	}	
}

package TestClass;

public class ParentTest {
	
	public String l = "BKJ";
	
	ParentTest(){
		
		System.out.println("Default Parent Class");
	}
	
	public ParentTest(String a, int b){
		
		System.out.println(a+" -- Public Parent Class -- "+b);
	}
	
	private ParentTest(String a, int b, boolean c){
		
		System.out.println(a+" -- private Parent Class -- "+b+" -- "+c);
	}
	
	public ParentTest(String a){
		
		System.out.println(a+" -- Public Parent Class 2 -- ");
	}
	
	private void methodP() {
		
		System.out.println("private void methodP");
	}
	
	public void methodP(String a) {
		
		System.out.println("public void methodP With Argument"+a);
	}
	
	public void xyz(String a) {
		
		System.out.println("public void xyz With Argument"+a);
	}
	
	public String methodP(int a) {
		
		System.out.println("public String methodP With Argument"+a);
		return ""+a;
	}

}

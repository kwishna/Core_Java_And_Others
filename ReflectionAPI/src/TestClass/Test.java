package TestClass;

public class Test extends ParentTest{

	private int i;
	public String x;
	protected boolean b = true;
	public static int ba = 10;
	
	Test(){
		
		System.out.println("Default Test Class");
	}
	
	public Test(String a, int b){
		
		System.out.println(a+" -- Public Test Class -- "+b);
	}
	
	private Test(String a, int b, boolean c){
		
		System.out.println(a+" -- Private Test Class -- "+b+" -- "+c);
	}
	
	public Test(String a){
		
		System.out.println(a+" -- Public Test Class 2 -- ");
	}
	
	
	
	private void e() {
		System.out.println("Private Method a In Test Class");
	}
	
	public void c() {
		System.out.println("Private Method a In Test Class");
	}
	
	public void a(String a) {
		
		System.out.println("public Method a In Test Class with argument "+a);
	}
	
	public void b(String a, int b) {
		
		System.out.println("public Method a In Test Class "+a+" and "+b);
	}
	
	
	private void f(String f, int h) {
		System.out.println("Private Method e In Test Class ------ "+f+"  ------  "+h);
	}
	
	class alpha{
		
	}
	
	
	public static void main(String[] args) {
		
	}

}

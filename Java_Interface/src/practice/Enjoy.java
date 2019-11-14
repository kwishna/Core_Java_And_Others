package practice;

class A{
	public int x;
	private int y;
	public void a(int i){
		System.out.println("A"+i);
		
	}
	
	void b(){
		System.out.println("2nd Function in A");
	}
}

class B extends A{
	public int x=190;
	public int m=200;
	@Override
	public void a(int j){
		System.out.println("B"+j);
	}

	void c(){
		System.out.println("2nd Function in B");
	}
}
class C extends B{
	@Override
	public void a(int k){
		System.out.println("C"+k);
		
	}
	
	void d(){
		System.out.println("2nd Function in C");
	}
}
public class Enjoy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		C c = new C();
	    A a = (A) c;
		
		
	}
}

package practice;

class C3 {
	C3(int a){
		f = a;
		System.out.println("parent"+f);
	}
	
	final int f;
	static int p =19;
	static void mStatic() { 
		p = p+1;
		System.out.println(p);
	}
	
	final void mFinal(){
		System.out.println("Final");
	}
	
	final int a = 100;
	//static int x=35;
	int x = 10;
}

class C4 extends C3{
	C4(int n){
		super(n);
		System.out.println("child"+n);
	}
	final int p = 200;
	int y = 90;
}

public class Test{
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	C3 c = new C4(4);
	System.out.println(c.a);
	c.x = 56;
	//c.p;
	C3.mStatic();
	
	
	C4 c1 = new C4(5);
	System.out.println(c1.p);
	C4.mStatic();
	}

}

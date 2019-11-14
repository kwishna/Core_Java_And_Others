package practice;

interface X{
	void a();
	void b();
	void c();
	void d();
}

abstract class Y implements X{
	void e(){System.out.println("Abstract e");}
	public void a(){System.out.println("Abstract A");}
	public void b(){System.out.println("Abstract B");}
	public void c(){System.out.println("Abstract C");}
	public void d(){System.out.println("Abstract D");}
	
}

class W extends Y implements X{
	public void c(){System.out.println("C");}
	public void d(){System.out.println("D");}
	public void f(){System.out.println("F");}
	public void g(){System.out.println("F");}
	}

class N extends W{
	void lm(){System.out.println("L");};
}

public class Test1 {
	public static void main(String[] args){
		W y = new N();
		y.a();
	}
}

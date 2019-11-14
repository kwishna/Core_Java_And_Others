package practice;

public class Enjoy2{
	int i = 10;
	{
		System.out.println("Instance Block");
	}
	static 
	{ 
		System.out.println("Static Block"); 
	}
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Object c = Class.forName("Enjoy2");
		System.out.println(((Enjoy2)c).i);
		Enjoy2 e = (Enjoy2)Class.forName("Enjoy2").newInstance();
		System.out.println(e.i);
	}

}

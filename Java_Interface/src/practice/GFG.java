package practice;

public class GFG {

	private static String name = "GFG";
	private String address = "Address I Don't Know";

	static {
		System.out.println("Static Block - "+name);
	}

	{
		System.out.println("Instance Variable - "+address);
	}

	private GFG(){
		System.out.println("Constructor Runs!");
	}

	private static void fun()
	{
		System.out.println("Welcome to GeeksforGeeks!!");
	}

	public static void main(String[] args)
	{
//		((GFG)null).fun();

		GFG g = new GFG();
	}
}

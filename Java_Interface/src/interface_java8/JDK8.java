package interface_java8;

public interface JDK8 {
	
	public boolean isTrue = true; // It Is public static final according to JVM.
	
	/**
	 * static : because, interface cannot be instantiated. Hence, variable must be static.
	 * final : because, for each implementation of this interface. implementing class may keep different value.
	 * 
	 * In Java 9 and later versions, an interface can have six kinds of things:

		Constant variables
		Abstract methods
		Default methods
		Static methods
		Private methods
		Private Static methods
		
		Private methods must contain body. :: Universal Rule For All Classes & Interface From JDK1
	 */
	
	public void m1(); // public void method cannot Be defined in interface. By Default abstract.
	
	public default String m2() {
		
		return "JDK8";
	}

	public static void something(){
		System.out.println("Something...");
	}

	private static void something1(){
		System.out.println("Something1...");
	}
	
	public static void k() {
		System.out.println("Print K");
	}

//	public int geek();
}

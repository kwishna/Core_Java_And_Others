package interface_java8;

public interface JDK8_Again {
	
	public boolean issTrue = true; // It Is public static final according to JVM.
	
	/**
	 * static : because, interface cannot be instantiated. Hence, variable must be static.
	 * final : because, for each implementation of this interface. implementing class may keep different value.
	 */
	
	public void m3(); // public void method cannot Be defined in interface
	
	public default String m2() {
		
		return "JDK8 Again";
	}
	
	public static void k() {
		System.out.println("Print L");
	}

//	public String geek();
}

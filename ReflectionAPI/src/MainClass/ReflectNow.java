package MainClass;


import java.lang.reflect.*;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import TestClass.*;
/**
 * Instances of the class Class represent classes and interfaces in a running Java application. 
 * An enum is a kind of class and an annotation is a kind of interface. Every array also belongs to a class that is 
 * reflected as a Class object that is shared by all arrays with the same element type and number of dimensions. 
 * The primitive Java types (boolean, byte, char, short, int, long, float, and double), and
 * the keyword void are also represented as Class objects.
 * 
 */
public class ReflectNow {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		
		Class<?> a = Test.class;
		
		Test t = new Test("Test");
		
//		 Class<? extends ParentTest> p = a.asSubclass(ParentTest.class);
		 
		//Or, Class<?> c = Class.forName("TestClass.Test");
		//Or, Class<?> c = (new Test()).getClass();
	
//		int mod = a.getModifiers(); System.out.println(mod);
//		Package pack = a.getPackage(); System.out.println(pack);
//		Class superclass = a.getSuperclass(); System.out.println(superclass);
//		Class[] interfaces = a.getInterfaces(); List.of(interfaces).stream().forEach(System.out::println);
		
	
		//Array Of All Constructor  **********************
//		Constructor<?> check[] = a.getConstructors();
//		for(Constructor c : check) {
//			System.out.println(c);
//		}
		//**********************************************
		
		
	// Invoking Constructor ****************************
//		Constructor<?> check1 = a.getConstructor(new Class[] {String.class});
//		System.out.println(check1.newInstance("Hello"));
//		System.out.println(check1.getParameterTypes());
		
	// 2nd	
//		Constructor<?> check1 = a.getConstructor(new Class[] {String.class, int.class});
//		System.out.println(check1.newInstance("Hello", 23));
//		System.out.println(check1.getParameterTypes());
		
	//3rd	
//		Constructor<?> check2 = a.getConstructor(String.class, int.class);
//		Object obj = check2.newInstance("Hello Again", 3); //Creating Object Through Constructor
//		System.out.println(obj);
//		System.out.println(Integer.toHexString(obj.hashCode()));
		//***********************************************
	
		
//		Properties systemProps = System.getProperties();
//		Set<Object> keySet = systemProps.keySet();
//		for(Object obj : keySet){
//			String key = (String) obj;
//			System.out.println("{"+obj+"="+systemProps.getProperty(key)+"}");
//		}
		
	
		//Fields *****************************************
//		Field[] f = a.getFields();
//		List.of(f).forEach(System.out::println);
		
//		Field fi = a.getField("x");
//		System.out.println(fi.getType());
//		System.out.println(fi.getName());
		
		//Setting And Getting Values **********************
//		Field fi = a.getField("x");
//		fi.set(t, "Bawaal");
//		System.out.println(fi.get(t));
		
		//Note : If The Field Is Static Then Pass null At The Place Of Object	
		
//		Field fi2 = a.getField("ba");
//		System.out.println(fi2.get(null));
//		
//		fi2.set(null, 26);
//		System.out.println(fi2.get(null));
		//**************************************************
		
		
		
		//Methods ******************************************
//		Method[] methods = a.getMethods();
//		List.of(methods).forEach(System.out::println);
//		
//		Method m1 = a.getMethod("a", String.class); System.out.println(m1);
//		Method m2 = a.getMethod("b", new Class[]{String.class, int.class}); System.out.println(m2);
//		Method m3 = a.getMethod("c", null); System.out.println(m3);
//		
//		Class<?>[] parameterTypes = m1.getParameterTypes();
//		List.of(parameterTypes).forEach(System.out::println);
		
//		Method method = a.getMethod("a", String.class);
//		Class<?> returnType = method.getReturnType(); System.out.println(returnType);
		
//		Method method2 = (new Test("Hell")).getClass().getMethod("a", String.class);
//		Object obj = method2.invoke(t, "Rama");
		
		//Note : If The Method Is Static Then Pass null At The Place Of Object
		
		//****************************************************
	
		
		//Accessing Private Fields ***************************
//		Field[] ff = a.getDeclaredFields(); // Returns All Modifiers Fields Except Inherited.
//		List.of(ff).forEach(System.out::println);
		
		//Accessing private int value
//		Field fif = a.getDeclaredField("i");
//		fif.setAccessible(true);
//		fif.set(t, 200); System.out.println(fi.get(t));
		
		//****************************************************
		
		//Accessing private method ***************************
//		Method me = a.getDeclaredMethod("f", new Class<?>[] {String.class, int.class});
//		me.setAccessible(true);
//		me.invoke(t, "Baba Ji", 10);
		
		//*****************************************************
		
		//Array ***********************************************
//		Object arrObj = Array.newInstance(int.class, 3);
//		int[] intArr = (int[]) arrObj;
//		Array.set(intArr, 0, 5);
		
//		Class<?> arrClass = Array.newInstance(int.class, 3).getClass(); // Important
//		Class<?> ss = arrClass.getComponentType();
//		System.out.println(ss);	
		
//		Class<?> str = String[].class;
//		System.out.println(str.getComponentType());
		
//		Module myClassModule = Test.class.getModule();
//************************************************************
		


//************************************************************
//		Loading a class dynamically is easy. All you need to do is to obtain a ClassLoader and call its loadClass() method. Here is an example:		
		
//			final class MainClass {
//
//			  public void main(String[] args){
//
//			    ClassLoader classLoader = MainClass.class.getClassLoader();
//
//			    try {
//			        Class aClass = classLoader.loadClass("com.jenkov.MyClass");
//			        System.out.println("aClass.getName() = " + aClass.getName());
//			    } catch (ClassNotFoundException e) {
//			        e.printStackTrace();
//			    }
//
//			}
//	}

  }
}
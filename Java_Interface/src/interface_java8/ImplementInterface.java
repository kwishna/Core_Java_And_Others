package interface_java8;

import java.util.Arrays;
import java.util.*;
import java.util.stream.Stream;

public class ImplementInterface implements JDK8, JDK8_Again{
	
	@Override
	public void m3() {

		System.out.println(isTrue);
		
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String m2() {
		
		return JDK8.super.m2(); // If Default Method Is Present In Both The Interfaces, It Is Required To Implement Like This.
	}

//	@Override
//	public Object geek(){ // Compile-Time Error : If Same Name Method Is Defined In 2 Diff Interface With Diff Return Type.
//		return 0;
//	}
	
	public static void main(String[] args) {
		
		ImplementInterface a = new ImplementInterface();
		
		JDK8.k();
		JDK8_Again.k();
		
		Stream<Integer> intStream = Stream.of(1,2,3,4,5);
		Integer[] intArray = intStream.toArray(Integer[]::new);
		System.out.println(Arrays.toString(intArray)); //prints [1, 2, 3, 4]
		
		
		List<String> li =  List.of(""); // Pre Java 10
		li.toString();
		
		var lis = List.of(""); // Java 10 onwards
		
		for(var v : lis) {
			System.out.println(v);
		}

	}

}

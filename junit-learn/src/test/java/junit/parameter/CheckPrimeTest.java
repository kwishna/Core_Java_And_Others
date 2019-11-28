package junit.parameter;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;
import junit.framework.Assert;

@RunWith(Parameterized.class)
public class CheckPrimeTest {
	private int value;
	private boolean isPrime;

	CheckPrime p = new CheckPrime();
	
	
	public CheckPrimeTest(int a, Boolean b){
		this.value = a;
		this.isPrime = b;
	}
	
	@SuppressWarnings("rawtypes")
	@Parameterized.Parameters
	public static Collection parameters(){
		return Arrays.asList(new Object[][]{ {1, true}, {2, true}, {3,true}, {4,false} });
	}
	
		@SuppressWarnings("deprecation")
		@Test
		public void isItPrimeTest(){
		Assert.assertEquals(isPrime, p.isItPrime(value));
		
	}
}

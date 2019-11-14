package pack;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class JavaBeginsTest {

	@SuppressWarnings("deprecation")
	@Test
	public void testMe() {
		JavaBegins j = new JavaBegins();
		int result = j.sum(5,9);
		Assert.assertEquals(14, result);
		
	}

}

package junit.practice2;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Assert;


@SuppressWarnings("deprecation")
public class TestMessageUtil2 {

	MessageUtil n = new MessageUtil();
	@Test(expected = ArithmeticException.class)
	public void sMsgTest(){
		int  i = n.sMsg();
		Assert.assertEquals(10, i);
		
		System.out.println("sMsg Test");
		int n = i/0;
		System.out.println("It Won't Print");
	}
}

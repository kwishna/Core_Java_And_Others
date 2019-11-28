package junit.practice2;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.*;

public class TestMessageUtil {
	MessageUtil m = new MessageUtil();
	@Test(timeout=1000)
	public void printMsgTest(){
		String s = m.printMsg();
		assertEquals("test", s);
		System.out.println("printMsgTest");
	}
}

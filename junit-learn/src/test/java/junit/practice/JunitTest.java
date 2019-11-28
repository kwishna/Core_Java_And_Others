package junit.practice;

import static org.junit.Assert.*;
import org.junit.*;
import org.junit.Test;

import junit.framework.*;

public class JunitTest{
	DoAWork a = new DoAWork();
	public String s = "Ara";
	@Before
	public void setMessageTest(){
		a.setMessage(s);
		System.out.println("Setting Some Message From Test");
	}
	
	@Test
	public void getMessageTest(){
		String getMsg = a.getMessage();
		assertEquals("Ara", getMsg);
		System.out.println("1st Test Done");
	}
	
	@Test
	public void testPrintMessage(){
		int x = a.printAmessage();
		assertEquals(100, x);
		System.out.println("2nd Test Print Test Done");
	}
	@After
	public void testComplete(){
		a.setMessage(null);
		System.out.println("xxxxxx --- Test Completed --- xxxxxxx"+"\n");
		
	}
}

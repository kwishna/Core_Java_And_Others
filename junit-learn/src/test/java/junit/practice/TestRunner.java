package junit.practice;

import java.util.List;

import org.junit.runner.*;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result result = JUnitCore.runClasses(JunitTest.class);
		List<Failure> r = result.getFailures();
		int failCount = result.getFailureCount();
		int runCount = result.getRunCount();
		for(Failure fail : r){
			System.out.println(r.toString());
		}
		System.out.println("Total Fail Count : "+failCount+"\n"+"Total Run Count Is : "+runCount);
		System.out.println(result.wasSuccessful());
	}

}

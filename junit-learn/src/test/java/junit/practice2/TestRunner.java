package junit.practice2;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Result result = JUnitCore.runClasses(TestSuites.class);
		List<Failure> f = result.getFailures();
		for(Failure fail : f){
			System.out.println(f.toString());
		}
		System.out.println(result.wasSuccessful());
	}

}

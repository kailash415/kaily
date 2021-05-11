package testng_programs;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Class implements IRetryAnalyzer {
int count=1,limit= 5;

	
	public boolean retry(ITestResult result) {
		if (count<=limit) {
			count++;
			return true;
		}
		return false;
	}

}

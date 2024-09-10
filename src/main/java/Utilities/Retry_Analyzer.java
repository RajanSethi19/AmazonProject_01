package Utilities;


import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Analyzer implements IRetryAnalyzer{
int count=3;
int retry_count=0;
	@Override
	public boolean retry(ITestResult result) {
		if(retry_count<count) {
			retry_count++;
			return true;
			
		}
		return false;
	}

}

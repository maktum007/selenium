package listener;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer
{

	public boolean retry(ITestResult arg0) {
		int tryCount =1;
		int maxCount =2;
		if(tryCount<=maxCount)
		{
			tryCount++;
			return true;
		}
		
		return false;
	}

}

package org.dataprovider;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class SampleFailRerun implements IRetryAnalyzer {

	int min=0,max=500;
	public boolean retry(ITestResult result)
	{
		if (min <max) 
		{
			min++;
		return true;
	}
return false;
}
}
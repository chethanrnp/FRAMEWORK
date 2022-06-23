package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

import generics.Basetest;
import generics.practise_BaseTest;

public class myListener implements ITestListener{

	 public void onTestFailure(ITestResult result) {
	String scriptName = result.getMethod().getMethodName();
	Basetest.actionUtil.captureScreenShot(scriptName);
	
	}
}

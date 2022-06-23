package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

import generics.practise;
import generics.practise_BaseTest;
import generics.practise_WebAction;

public class practseListner implements ITestListener{

	 public void onTestFailure(ITestResult result) {
		 String scriptName = result.getMethod().getMethodName();
		 practise.actionUtile.namecaptureScreenShot(scriptName);
		 
	}
}

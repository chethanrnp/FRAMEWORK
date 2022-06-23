package scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import generics.Basetest;
import pages.initialisepages;

public class actiLogin extends Basetest{

	 @Test(groups= {"smoketest"})
	 public void actLoginScript() 
	 {
		initialisepages pages=new initialisepages(driver);
		pages.actitimeLogin.login(prop.getProperty("username"), prop.getProperty("password"));
		}
}

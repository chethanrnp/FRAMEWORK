package scripts;

import org.testng.annotations.Test;

import dataProviders.DataClass;
import generics.Basetest;
import pages.initialisepages;

public class practise extends generics.practise{
	
	 @Test()
	 public void actLogin()
	 {
		 initialisepages pages=new initialisepages(driver);
		 pages.actitimeLogin.login(prop.getProperty("username"), prop.getProperty("password"));
		
	 }
	 
}

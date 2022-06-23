package scripts;

import org.testng.annotations.Test;

import dataProviders.practise_DataProvider;
import generics.practise_BaseTest;
import pages.practise_initialisepages;

public class practise_Home extends practise_BaseTest{

	
	 @Test(dataProviderClass=practise_DataProvider.class,dataProvider="addUserData",groups= {"Regressiontest"})
	 public void actiLogin(String fn,String ln,String em)
	 {
		practise_initialisepages pages=new practise_initialisepages(driver) ;
		pages.actiLogin.login(prop.getProperty("userName"), prop.getProperty("password"));
		pages.enterTimeTrack.clickUser();
		pages.userList.clickNewUser();
		pages.addUser.addUser(fn, ln, em);
	 }
}

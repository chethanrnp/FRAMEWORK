package scripts;

import org.testng.annotations.Test;

import dataProviders.DataClass;
import generics.Basetest;
import pages.initialisepages;

public class addUserScript extends Basetest{

	 @Test(dataProviderClass=DataClass.class,dataProvider="addUserData")
	 public void actLoginScript(String fn,String ln,String em) 
	 {
		initialisepages pages=new initialisepages(driver);
		pages.actitimeLogin.login(prop.getProperty("username"), prop.getProperty("password"));
		pages.actitimeEnterTimeTrack.clickUsers();
		pages.userList.clickNewUser();
		pages.addUser.createUser(fn,ln,em);
		}

}

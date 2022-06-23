package dataProviders;

import org.testng.annotations.DataProvider;

import generics.practise_BaseTest;
import generics.practise_WebAction;

public class practise_DataProvider {

	 @DataProvider
	 public Object[][] addUserData() {
		 Object[][] ob=new Object[1][3];
		 ob[0][0]=practise_WebAction.getDtat(practise_BaseTest.excelPath, "adduser", 1, 0);
		 ob[0][1]=practise_WebAction.getDtat(practise_BaseTest.excelPath, "adduser", 1, 1);
		 ob[0][2]=practise_WebAction.getDtat(practise_BaseTest.excelPath, "adduser", 1, 2);
		 return ob;
	 }
}

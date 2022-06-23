package dataProviders;

import org.testng.annotations.DataProvider;

import generics.Basetest;
import generics.webActionUtil;

public class DataClass {

	 @DataProvider
	 public Object[][] addUserData()
	 {
		 Object[][] d=new Object[1][3];
		 d[0][0]=webActionUtil.getData(Basetest.excelpath, "adduser", 1, 0);
		 d[0][1]=webActionUtil.getData(Basetest.excelpath, "adduser", 1, 1);
		 d[0][2]=webActionUtil.getData(Basetest.excelpath, "adduser", 1, 2);
		 return d;
	 }
}

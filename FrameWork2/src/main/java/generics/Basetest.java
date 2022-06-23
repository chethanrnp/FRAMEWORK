package generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Basetest {
 
	 public static final String userDir=System.getProperty("user.dir");
	 public static final String chromeKey="webdriver.chrome.driver";
	 public static final String geckoKey="webdriver.gecko.driver";
	 public static final String chromeValue=userDir+"\\drivers\\chromedriver.exe";
	 public static final String geckoValue=userDir+"\\drivers\\geckodriver.exe";
	 public static final String excelpath=userDir+"\\data\\excel.xlsx";
	 
	 public static webActionUtil actionUtil;
	 
	public  WebDriver driver;
	public Properties prop;
   @BeforeClass(groups= {"smoketest","Regressiontest"})
   public void setPath() 
   {
	  prop =new Properties();
	   try {
		FileInputStream f=new FileInputStream(userDir+"\\data\\config.properties");
		prop.load(f);
	} catch (Throwable e) {
		System.out.println(e);
	}
	   System.setProperty(chromeKey, chromeValue);
	   System.setProperty(geckoKey, geckoValue);
   }
   
   @BeforeMethod(groups= {"smoketest","Regressiontest"})
   public void launchBrowser() 
   {
	   driver=new ChromeDriver();
	   actionUtil=new webActionUtil(driver);
	   driver.manage().window().maximize();
	   driver.manage().deleteAllCookies();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   driver.get(prop.getProperty("url"));
   }
   
   @AfterMethod(groups= {"smoketest","Regressiontest"})
   public void closeBrowser()
   {
	   driver.quit();
   }
   
   @AfterSuite(groups= {"smoketest","Regressiontest"})
   public void killDriver()
   {
	   try {
		Runtime.getRuntime().exec("taskkill /IM chromedriver.exe /F");
	} catch (IOException e) {
		
	}
   }
}

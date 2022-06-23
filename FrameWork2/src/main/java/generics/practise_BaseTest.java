package generics;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class practise_BaseTest {

	 public static final String userDir=System.getProperty("user.dir");
	 public static final String chromeKey="webdriver.chrome.driver";
	 public static final String geckoKey="webdriver.gecko.driver";
	 public static final String chromeValue=userDir+"\\drivers\\chromedriver.exe";
	 public static final String geckoValue=userDir+"\\drivers\\geckodriver.exe";
	 public static final String excelPath=userDir+"\\data\\excel.xlsx";
	 public static practise_WebAction actionUtil;
	 
	public WebDriver driver;
	public Properties prop;

	
	 @BeforeClass
	 public void setPath()
	 {
		 prop =new Properties();
		 try {
			FileInputStream f=new FileInputStream(userDir+"\\data\\practise_Config");
			prop.load(f);
		} catch (Exception e) {
			System.out.println(e);
		}
		 System.setProperty(chromeKey, chromeValue);
		 System.setProperty(geckoKey, geckoValue);
	 }
	 @Parameters("Browser")
	 @BeforeMethod
	 public void laucnchBrowser(String bn)
	 {
		 if(bn.equals("chrome"))
		 driver=new ChromeDriver();
		else if(bn.equals("firefox"))
		 driver=new FirefoxDriver();
		 
		 actionUtil=new practise_WebAction(driver);
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get(prop.getProperty("url"));
	 }
	 
	 @AfterMethod
	 public void closeBrowser()
	 {
		 driver.quit();
	 }
}

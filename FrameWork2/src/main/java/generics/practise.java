package generics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class practise {

	public static final String userDir=System.getProperty("user.dir");
	public static final String chromeKey="webdriver.chrome.driver";
	public static final String geckoKey="webdriver.gecko.driver";
	public static final String chromeValue=userDir+"\\drivers\\chromedriver.exe";
	public static final String geckoValue=userDir+"\\drivers\\geckodriver.exe";
	public static practise2 actionUtile;
	
	public WebDriver driver;
	public Properties prop;
	
	@BeforeClass
	public void setPath()
	{
		prop=new Properties();
	  try {
		FileInputStream f=new FileInputStream(userDir+"\\data\\config.properties");
		prop.load(f);
	} catch (Throwable e) {
		System.out.println(e);
	}
	  System.setProperty(chromeKey, chromeValue);
	  System.setProperty(geckoKey, geckoValue);
	}

	@BeforeMethod
	public void launchBrowser()
	{
	    driver =new ChromeDriver();
		actionUtile=new practise2(driver);
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

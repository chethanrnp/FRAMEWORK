package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extentReport {

	public static void main(String[] args) {
		ExtentReports extent=new ExtentReports();
		ExtentSparkReporter htmlReporter=new ExtentSparkReporter("extentReports.html");
		extent.attachReporter(htmlReporter);
		ExtentTest test = extent.createTest("my first test");
		
		 System.setProperty("webdriver.chrome.driver", "E:\\selenium_workspace\\selenium_project\\drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			test.log(Status.INFO, "open chrome browser");
			//fetches the web app and waits until the page is loaded
			driver.get("https://demo.actitime.com/login.do");
			
			test.log(Status.INFO, "open acti loginpage");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
			test.log(Status.FAIL, "enter the username");
			driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manage");
			test.log(Status.PASS, "enter password");
			driver.findElement(By.xpath("//a[@id='loginButton']")).click();
			test.log(Status.PASS, "clicks on login button");
			extent.flush();
	}
}

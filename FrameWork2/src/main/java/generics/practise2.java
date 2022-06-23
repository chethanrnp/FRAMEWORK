package generics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class practise2 {

	WebDriver driver;
	public practise2(WebDriver driver) {
		this.driver=driver;
	}
	
	public static String getData(String path,String sheet,int r,int c) {
		String d=null;
		
		try {
			FileInputStream f=new FileInputStream(path);
			Workbook book = WorkbookFactory.create(f);
			d=book.getSheet(sheet).getRow(r).getCell(c).getStringCellValue();
		} catch (Exception e) {
		
		}
		return d;
	}
	public void namecaptureScreenShot(String scriptName) {
		TakesScreenshot t=(TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest=new File(practise.userDir+"screenshot"+scriptName+".png");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			
		}
	}
	public void validteTitel(String expectedTitle) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		try {
			wait.until(ExpectedConditions.titleIs(expectedTitle));
			Reporter.log("title is matching");
		} catch (Exception e) {
          Reporter.log("title is not matching");
         Assert.fail();
		}
	}
	public void name(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("element is visible");
		} catch (Exception e) {
			Reporter.log("element is not visible");
			Assert.fail();
		}
	}
	public void doubleClick(WebElement element) {
		Actions a=new Actions(driver);
		a.doubleClick(element).perform();
	}
	
	public void rightClick(WebElement element) {
		Actions a=new Actions(driver);
		a.contextClick(element).perform();
	}
}

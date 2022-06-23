package generics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class practise_WebAction {

	 WebDriver driver;
	 public practise_WebAction(WebDriver driver) {
		this.driver=driver;
	 }
		public static String getDtat(String path,String sheet,int r,int c)
		{
			String d=null;
          try {
        	  FileInputStream f=new FileInputStream(path);
        	  Workbook book = WorkbookFactory.create(f);
        	  d=book.getSheet(sheet).getRow(r).getCell(c).getStringCellValue();
		} catch (Exception e) {
					}
          return d;
	}
		public void getScreenShot(String scriptName)
		{
		TakesScreenshot t=(TakesScreenshot) driver;	
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest=new File(practise_BaseTest.userDir+"\\screenshot\\"+scriptName+".png");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			
		}
		}
		
		public void validateTitle(String expectedTitle)
		{
			WebDriverWait wait=new WebDriverWait( driver, Duration.ofSeconds(30));
			try {
				wait.until(ExpectedConditions.titleIs(expectedTitle));
				Reporter.log("Title is matching");
			} catch (Exception e) {
				Reporter.log("Title is not matching");
				Assert.fail();
			}
		}
		
		public void validateElementVisibility(WebElement element)
		{
			WebDriverWait wait=new WebDriverWait( driver, Duration.ofSeconds(30));
			try {
				wait.until(ExpectedConditions.visibilityOf(element));
				Reporter.log("element is visible");
			} catch (Exception e) {
				Reporter.log("element is visible");
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

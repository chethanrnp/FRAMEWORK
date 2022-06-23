package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class practise_AddUser {
 
	 @FindBy(xpath="(//input[@name='firstName'])[2]")
	 private WebElement tbFirstName;
	 
	 @FindBy(xpath="(//input[@name='lastName'])[2]")
	 private WebElement tbLastName;
	 
	 @FindBy(xpath="(//input[@name='email'])[2]")
	 private WebElement tbEmail;
	 
	 @FindBy(xpath="//div[text()='Save & Send Invitation']")
	 private WebElement btnSave;
	 
	 public void addUser(String fn,String ln,String em)
	 {
		 this.tbFirstName.sendKeys(fn);
		 this.tbLastName.sendKeys(ln);
		 this.tbEmail.sendKeys(em);
		 this.btnSave.click();
	 }
	 public practise_AddUser(WebDriver driver) {
		 PageFactory.initElements(driver, this);
	}
}

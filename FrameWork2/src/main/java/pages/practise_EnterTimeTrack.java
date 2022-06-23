package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class practise_EnterTimeTrack {

	 @FindBy(xpath="//a[text()='Logout']")
	 private WebElement btnLogOut;
	 
	 @FindBy(xpath="//a[@class='content users']")
	 private WebElement lnkUsers;

	 @FindBy(xpath="//a[@class='content reports']")
	 private WebElement lnkReports;
	 
	 public void clickUser()
	 {
		 this.lnkUsers.click();
	 }
	 
	 public practise_EnterTimeTrack(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actitimeEnterTimeTrack_page2 {

	 @FindBy(xpath="//a[@class='content users']")
	 private WebElement lnkUsers;
	 
	 @FindBy(xpath="//a[@class='content reports']")
	 private WebElement lnkReports;
	 
	 @FindBy(id="logoutLink")
	 private WebElement btnLogout;
	 
	 public void clickUsers() {
		this.lnkUsers.click();
	}
	 
	 public void clickLogout() {
			this.btnLogout.click();
		}
	 
	 public actitimeEnterTimeTrack_page2(WebDriver driver) {
		 //initialises the webelements
			PageFactory.initElements(driver, this);
	}
}

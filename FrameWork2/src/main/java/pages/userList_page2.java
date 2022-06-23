package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class userList_page2 {

	 @FindBy(xpath="//div[@class='components_button_label']")
	 private WebElement lnkNewUser;
	 
	 public void clickNewUser() {
			this.lnkNewUser.click();
		}
	 
	 public userList_page2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}

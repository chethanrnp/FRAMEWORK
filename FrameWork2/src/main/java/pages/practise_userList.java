package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class practise_userList {

	 @FindBy(xpath="//div[@class='components_button_label']")
	 private WebElement lnkNewUser;
	 
	 public void clickNewUser()
	 {
		 this.lnkNewUser.click();
	 }

	  public practise_userList(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}

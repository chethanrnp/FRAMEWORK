package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actitimelogin_practise {

	 @FindBy(id="username")
	 private WebElement tbUsername;
	 
	 @FindBy(name="pwd")
	 private WebElement tbPassword;
	 
	 @FindBy(id="loginButton")
	 private WebElement btnLogin;
	 
	 public void login(String un,String pw) 
	 {
		this.tbUsername.sendKeys(un); 
		this.tbPassword.sendKeys(pw);
		this.btnLogin.click();
	 }
	 
	 public actitimelogin_practise(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}

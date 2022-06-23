package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.Basetest;
import generics.practise;
import net.bytebuddy.asm.Advice.This;

public class actitime_login_page2 {
    //tb=text box
	 @FindBy(name="username")
	 private WebElement tbUsername;
	 
	 @FindBy(name="pwd")
	 private WebElement tbPassword;
	 
	 @FindBy(id="loginButton")
	 private WebElement btnLoginButton;
	 
	 public void login(String un,String pw) {
		this.tbUsername.sendKeys(un);
		this.tbPassword.sendKeys(pw);
		this.btnLoginButton.click();
		Basetest.actionUtil.validateTitle("chethan");
		//practise.actionUtile.validteTitel("chethan");
	}
	 
	 public actitime_login_page2(WebDriver driver) {
		 //initialises the webelements
		PageFactory.initElements(driver, this);
	}
}

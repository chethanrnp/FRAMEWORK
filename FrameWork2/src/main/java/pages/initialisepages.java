package pages;

import org.openqa.selenium.WebDriver;

public class initialisepages {

	 public actitime_login_page2 actitimeLogin;
	 public actitimeEnterTimeTrack_page2 actitimeEnterTimeTrack;
	 public userList_page2 userList;
	 public AddUser_page2 addUser;
	 
	 public initialisepages(WebDriver driver) {
		this.actitimeLogin=new actitime_login_page2(driver);
		this.actitimeEnterTimeTrack=new actitimeEnterTimeTrack_page2(driver);
		this.userList=new userList_page2(driver);
		this.addUser=new AddUser_page2(driver);
	}
}

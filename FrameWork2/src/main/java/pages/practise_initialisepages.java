package pages;

import org.openqa.selenium.WebDriver;

public class practise_initialisepages {

	 public actitimelogin_practise actiLogin;
	 public practise_EnterTimeTrack enterTimeTrack;
	 public practise_userList userList;
	 public practise_AddUser addUser;
	 
	 public practise_initialisepages(WebDriver driver) {
		this.actiLogin=new actitimelogin_practise(driver);
		this.enterTimeTrack=new practise_EnterTimeTrack(driver);
		this.userList=new practise_userList(driver);
		this.addUser=new practise_AddUser(driver);
	}
}

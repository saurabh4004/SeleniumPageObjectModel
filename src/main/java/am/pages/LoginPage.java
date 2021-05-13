package am.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Page{
	
	public ZohoAppPage doLogin(String username,String password) {
		type("email_CSS", username);
		click("nextbutton_XPATH");
		type("password_XPATH", password);
		click("signinbutton_XPATH");
	return new ZohoAppPage();
	}
	
	
}

package am.rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import am.pages.HomePage;
import am.pages.LoginPage;
import am.pages.Page;
import am.pages.ZohoAppPage;
import am.pages.crm.CrmHomePage;
import am.pages.crm.accounts.AccountPages;
import am.pages.crm.accounts.CreateAccountPage;

public class LoginTest {

	public static void main(String[] args) {
	
		
		HomePage home = new HomePage();
		LoginPage lp=home.goToLogin();
		ZohoAppPage zp=lp.doLogin("saurabh.gabhane7@gmail.com", "automation123");
		 zp.goToCRM();
		AccountPages account= Page.menu.gotoAccounts();
		CreateAccountPage ca= account.gotoCreateAccounts();
		ca.createAccounts("Saurabh");

	}

}

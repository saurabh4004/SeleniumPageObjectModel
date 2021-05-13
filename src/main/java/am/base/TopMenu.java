package am.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import am.pages.Page;
import am.pages.crm.accounts.AccountPages;

public class TopMenu {
	WebDriver driver;
	public TopMenu(WebDriver driver) {
		this.driver=driver;
	}

	public void gotoHome() {

	}

	public void gotoFeeds() {

	}

	public void gotoLeads() {

	}

	public AccountPages gotoAccounts() {
		Page.click("account_XPATH");
		return new AccountPages();
	}

	public void gotoContacts() {
		Page.click("contact_CSS");
	}
	public void signOut() {
		
	}
}

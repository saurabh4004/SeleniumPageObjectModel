package am.pages.crm.accounts;

import org.openqa.selenium.By;

import am.pages.Page;

public class AccountPages extends Page {

	
	public CreateAccountPage gotoCreateAccounts() {
		click("createaccount_XPATH");
		return new CreateAccountPage();
	}

	public void gotoImportAccounts() {

	}
}

package am.pages.crm.accounts;

import org.openqa.selenium.By;

import am.pages.Page;

public class CreateAccountPage extends Page{

	public void createAccounts(String name) {
		type("crmaccountname_XPATH", name);
	}
	
	public void gotoImportAccounts() {
		
	}
}

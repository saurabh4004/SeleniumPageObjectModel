package am.testcases;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.pages.Page;
import am.pages.ZohoAppPage;
import am.pages.crm.accounts.AccountPages;
import am.pages.crm.accounts.CreateAccountPage;
import am.utilities.Utilities;

public class CreateAccountTest {
	@Test(dataProviderClass = Utilities.class,dataProvider = "dp")
	public void createAccountTest(Hashtable<String, String> data) {
		ZohoAppPage zp = new ZohoAppPage();
		zp.goToCRM();
		AccountPages account= Page.menu.gotoAccounts();
		CreateAccountPage ca= account.gotoCreateAccounts();
		ca.createAccounts(data.get("accountname"));
		Assert.fail("CreateAccountTest Failed");
	}
}

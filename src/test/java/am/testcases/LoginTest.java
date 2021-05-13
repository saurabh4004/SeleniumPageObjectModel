package am.testcases;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.pages.HomePage;
import am.pages.LoginPage;
import am.pages.ZohoAppPage;
import am.utilities.Utilities;

public class LoginTest extends BaseTest{

	@Test(dataProviderClass = Utilities.class, dataProvider = "dp")
	public void loginTest(Hashtable<String, String> data)
	{
		HomePage home = new HomePage();
		LoginPage lp=home.goToLogin();
		ZohoAppPage zp=lp.doLogin(data.get("username"), data.get("password"));
		Assert.fail("LoginTest Failed");
	}
}

package am.testcases;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import am.pages.Page;

public class BaseTest {

	@AfterSuite
	public void tearDown() {
		Page.quit();
	}
}

package am.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import am.pages.crm.CrmHomePage;

public class ZohoAppPage extends Page{
	
	public CrmHomePage gotoChat() {
		driver.findElement(By.xpath("//div[contains(text(),'Cliq')]")).click();
		return new CrmHomePage();
	}
	
	public CrmHomePage goToCRM() {
		click("crmlink_XPATH");
		return new CrmHomePage();
	}
	
	public void gotoSalesIQ() {
		
	}
}

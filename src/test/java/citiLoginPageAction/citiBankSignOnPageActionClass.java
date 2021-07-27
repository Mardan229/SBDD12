package citiLoginPageAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import citiBankSignOnPageElements.citiBankSignOnPageElemnts;
import citiDriverPackage.driverSetUp;

public class citiBankSignOnPageActionClass {
	
	citiBankSignOnPageElemnts citiBankSignOnActionClass;
	
	public citiBankSignOnPageActionClass () {
		this.citiBankSignOnActionClass = new citiBankSignOnPageElemnts();
		PageFactory.initElements(driverSetUp.chromeDriver, citiBankSignOnActionClass);
	}
	
	public void getcitiBankSignOnPage() {
		driverSetUp.chromeDriver.get("https://www.citi.com/login?");
		driverSetUp.chromeDriver.manage().window().maximize();
		driverSetUp.chromeDriver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
	public void inputUserId (String UserId) {
		citiBankSignOnActionClass.userId.sendKeys(UserId);	
	}
	public void inputPassword(String password) {
	citiBankSignOnActionClass.password.sendKeys(password);
		
	}
	
	public void clickRememberUserId() {
		citiBankSignOnActionClass.RememberUserId.click();
	}
	
public void clickSumbentBatton() {
	citiBankSignOnActionClass.SubmentButn.click();
}
}

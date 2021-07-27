package citiBankSignOnPageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class citiBankSignOnPageElemnts {
	
	
	
	@FindBy(id="UserName")
	public WebElement userId;
	
	
	@FindBy(id="password")
	public WebElement password;
	
	@FindBy(id="RememberUserId")
	public WebElement RememberUserId;
	

	
	@FindBy(xpath="//*[@id=\"signInBtn\"]")
	public WebElement SubmentButn;
	
	
}

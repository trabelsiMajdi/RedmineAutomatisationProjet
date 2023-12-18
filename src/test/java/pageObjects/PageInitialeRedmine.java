
package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageInitialeRedmine extends BasePage {

	public PageInitialeRedmine(WebDriver driver) {
		super(driver);
	}

	// Elements
	@FindBy(xpath = "//a[@class='register']")
	WebElement lnk_Register;

	@FindBy(xpath = "//a[@class='login']")
	WebElement lnk_Login;
	
	// Action Methods
	
	public void clickRegister() {
		lnk_Register.click();
	}
	
	public void clickLogin() {
		lnk_Login.click();
	}
}
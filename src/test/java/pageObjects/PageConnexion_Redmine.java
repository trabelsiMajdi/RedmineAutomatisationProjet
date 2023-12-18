
package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageConnexion_Redmine extends BasePage {
	
	
	public PageConnexion_Redmine(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath = "//input[@id='username']")
	WebElement txt_Email;

	@FindBy(xpath = "//input[@id='password']")
	WebElement txt_Password;
	
	@FindBy(xpath = "//input[@id='login-submit']")
	WebElement btn_Login;
	
	
	
	public void setEmail(String email) {
		txt_Email.sendKeys(email);

	}

	public void setPassword(String pwd) {
		txt_Password.sendKeys(pwd);

	}
	
	public void clickLogin() {
		btn_Login.click();
	}
	
	
}


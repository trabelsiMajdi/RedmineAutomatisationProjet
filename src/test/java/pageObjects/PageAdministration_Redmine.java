
package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageAdministration_Redmine extends BasePage {

	public PageAdministration_Redmine(WebDriver driver) {
		super(driver);
	}

	// Elements
	@FindBy(xpath = "//a[@class='icon icon-projects projects']")
	WebElement lnk_clickProjets;

	
	// Action Methods
	
	public void clickProjets() {
		lnk_clickProjets.click();
	}
	

}
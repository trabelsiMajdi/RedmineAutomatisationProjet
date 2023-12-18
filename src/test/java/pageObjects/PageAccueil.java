
package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageAccueil extends BasePage {

	public PageAccueil(WebDriver driver) {
		super(driver);
	}

	// Elements
	@FindBy(xpath = "//a[text()='Projets']")
	WebElement lnk_clickProjets;

	@FindBy(xpath = "//a[text()='Administration']")
	WebElement lnk_clickAdministration;
	

	
	
	// Action Methods
	
	public void clickProjets() {
		lnk_clickProjets.click();
	}
	

	public void clickAdministration() {
		lnk_clickAdministration.click();
	}
	
	
}
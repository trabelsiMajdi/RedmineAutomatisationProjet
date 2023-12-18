
package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


	public class Page_MonCompte_Redmine extends BasePage {
		
		
		public Page_MonCompte_Redmine(WebDriver driver) {
			super(driver);
		}
	
	
	@FindBy(xpath = "//h2[normalize-space()='Ma page']")
	WebElement succesLogin_Confirmation;
	
	@FindBy(xpath = "//a[text()='Déconnexion']")
	WebElement lnk_Deconnexion;
	
	public boolean  MonCompteExist() 
	{
		try {
			return (succesLogin_Confirmation.isDisplayed());
		} catch (Exception e) {
			return (false);

		}
	
	}
	
	public void clickDeconnexion() {
		lnk_Deconnexion.click();
	}
}

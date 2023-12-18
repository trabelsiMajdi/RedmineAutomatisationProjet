
package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageProjets extends BasePage {

	public PageProjets(WebDriver driver) {
		super(driver);
	}

	// Elements
	@FindBy(xpath = "//a[text()='Nouveau projet']")
	WebElement lnk_clickNouvProjet;

	@FindBy(xpath = "//input[@id='name']")
	WebElement txt_clickRechercheProjet;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement btn_Appliquer;
	

	@FindBy(xpath = "//a[text()='projetmajdiautomatisation @1255']")
	WebElement lnk_selectProjet;
	
	@FindBy(xpath = "//a[text()='Copier']")
	WebElement lnk_CopierPojet;
	
	
	// Action Methods
	
	public void clickNouvProjet() {
		lnk_clickNouvProjet.click();
	}
	
	public void clickRechercheProjet(String rech) {
		txt_clickRechercheProjet.sendKeys(rech);;
	}
	
	public void clickAppliquer() {
		btn_Appliquer.click();
	}

	public void clickselectProjet() {
		lnk_selectProjet.click();
	}
	public void clickCopierPojet() {
		lnk_CopierPojet.click();
	}
}
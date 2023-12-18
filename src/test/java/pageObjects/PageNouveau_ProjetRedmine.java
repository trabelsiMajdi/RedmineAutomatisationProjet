
package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageNouveau_ProjetRedmine extends BasePage {

	public PageNouveau_ProjetRedmine(WebDriver driver) {
		super(driver);
	}

	// Elements
	//EnregistrerNouveauCompte
	  
		
		//4-nom
		@FindBy(xpath = "//input[@id='project_name']")
		WebElement txt_Name;
        //5-Description
		@FindBy(xpath = "//textarea[@id='project_description']")
		WebElement txt_Description;
        //6-identifiant
		@FindBy(xpath = "//input[@id='project_identifier']")
		WebElement txt_identifiant;
		 //6-SiteWeb
		@FindBy(xpath = "//select[@id='project_parent_id']")
		WebElement txt_SiteWeb;
		
		//7-btnCreer
		@FindBy(xpath="//input[@value='Créer']")
		WebElement btn_Creer;
		
		@FindBy(xpath="//input[@value='Copier']")
		WebElement btn_Copier;
		
		//8-Confirmation_Creationprojet
		@FindBy(xpath = "//div[normalize-space()='Création effectuée avec succès.']")
		WebElement msgConfirmation;

		
		
		public void setName(String name) {
			txt_Name.sendKeys(name);

		}
		
		public void setDescription(String desc) {
			txt_Description.sendKeys(desc);

		}
		
		public void setIdentifiant(String iden) {
			txt_identifiant.sendKeys(iden);

		}

		public void setSiteWeb(String site) {
			txt_SiteWeb.sendKeys(site);

		}
		
		
		public void clickCreer() {
			
			btn_Creer.click();	
		}

		public void clickCopier() {
					
			btn_Copier.click();	
				}
		
		public String getConfirmationMsg() {
			try {
				return (msgConfirmation.getText());
			} catch (Exception e) {
				return (e.getMessage());

			}

		}
}


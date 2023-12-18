
package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageConfiguration_ProjetRedmine extends BasePage {

	public PageConfiguration_ProjetRedmine(WebDriver driver) {
		super(driver);
	}

	
	  
		
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
		@FindBy(xpath="//input[@value='Sauvegarder']")
		WebElement btn_Sauvegarder;
		
		//8-Confirmation_Creationprojet
		@FindBy(xpath = "//div[@id='flash_notice']")
		WebElement msgConfirmation;

		
		
		public void setName(String tname) {
			txt_Name.sendKeys(tname);

		}
		
		public void setDescription(String rdesc) {
			txt_Description.sendKeys(rdesc);

		}
		
		public void setIdentifiant(String ident) {
			txt_identifiant.sendKeys(ident);

		}

		public void setSiteWeb(String sitew) {
			txt_SiteWeb.sendKeys(sitew);

		}
		
		
		public void Sauvegarder() {
			//sol1 
			btn_Sauvegarder.click();
		}

		
		public String getConfirmationMsg() {
			try {
				return (msgConfirmation.getText());
			} catch (Exception e) {
				return (e.getMessage());

			}

		}
}
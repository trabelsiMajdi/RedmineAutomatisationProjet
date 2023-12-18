
package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageCreationCompte_Redmine extends BasePage {

	public PageCreationCompte_Redmine(WebDriver driver) {
		super(driver);
	}

	// Elements
	//EnregistrerNouveauCompte
	   //1-identifiant
		@FindBy(xpath = "//input[@id='user_login']")
		WebElement txt_jdentifiant;
		//2-Mot_de_Pass
		@FindBy(xpath = "//input[@id='user_password']")
		WebElement txt_Password;
		//3-Conf_Mot_de_Pass
		@FindBy(xpath = "//input[@id='user_password_confirmation']")
		WebElement txt_ConfirmPassword;
		//4-Prenom
		@FindBy(xpath = "//input[@id='user_firstname']")
		WebElement txt_FirstName;
        //5-Nom
		@FindBy(xpath = "//input[@id='user_lastname']")
		WebElement txt_LastName;
        //6-Email
		@FindBy(xpath = "//input[@id='user_mail']")
		WebElement txt_Email;
	    //7-btn_Soumettre
		@FindBy(xpath="//input[@value='Soumettre']")
		WebElement btn_register;
		//8-Confirmation_CreationCompte
		@FindBy(xpath = "//*[@id=\"flash_error\"]")
		WebElement msgConfirmation;

		
		public void setjdentifiant(String jdentif) {
			txt_jdentifiant.sendKeys(jdentif);

		}
		
		public void setPassword(String pwd) {
			txt_Password.sendKeys(pwd);

		}

		public void setConfirmPassword(String pwd) {
			txt_ConfirmPassword.sendKeys(pwd);

		}
		
		
		public void setFirstName(String Fname) {
			txt_FirstName.sendKeys(Fname);

		}
		
		public void setLastName(String lname) {
			txt_LastName.sendKeys(lname);

		}
		
		public void setEmail(String Email) {
			txt_Email.sendKeys(Email);

		}

		
		public void clickRegister() {
			 
			 btn_register.click();		
		}

		
		public String getConfirmationMsg() {
			try {
				return (msgConfirmation.getText());
			} catch (Exception e) {
				return (e.getMessage());

			}

		}
}


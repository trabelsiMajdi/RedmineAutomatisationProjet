
package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.PageCreationCompte_Redmine;
import pageObjects.PageInitialeRedmine;


public class TC_01_EnregistrerNouveauCompte extends BaseClass{
	
	@Test
	 public void test_Enregistrer_NouveauCompte() throws InterruptedException
	{
		logger.debug(" ....application logs.........");
		logger.info("*** Start test1: TC_01_EnregistrerNouveauCompte ***");
		
		try
		  {
		PageInitialeRedmine hp=new PageInitialeRedmine(driver);
		hp.clickRegister();
		logger.info("cliquer sur le lien s'enregistrer");
		
		PageCreationCompte_Redmine regpage=new PageCreationCompte_Redmine(driver);
		logger.info("Entrer les données du client");
		
		regpage.setjdentifiant(randomeString().toUpperCase());
		regpage.setFirstName(randomeString().toUpperCase());
		regpage.setLastName(randomeString().toUpperCase());
		regpage.setEmail(randomeString()+"@gmail.com");
		
	
		String password=randomAlphaNumeric();
		regpage.setPassword(password);
		regpage.setConfirmPassword(password);
		logger.info("Entrer le mot de passe");
		
		regpage.clickRegister();
		logger.info("cliquer sur le bouton Enregistrer");
		
		String confmsg=regpage.getConfirmationMsg();
		logger.info("validation du message attendu");
		
		Assert.assertEquals(confmsg, "Votre compte a été créé et attend l'approbation de l'administrateur.","Test failed");
		}
		 catch(Exception e)
		{
			 logger.error("Test failed");
			Assert.fail();
		}
		 
		logger.info("*** Fin test1: TC_01_EnregistrerNouveauCompte ***");
	}
	
	
}
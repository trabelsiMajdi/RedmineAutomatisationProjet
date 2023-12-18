
package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;



import pageObjects.PageConnexion_Redmine;
import pageObjects.PageInitialeRedmine;
import pageObjects.Page_MonCompte_Redmine;


public class TC_02_ConnexionRedmine extends BaseClass {
	
	
	@Test
	public void ConnexionRedmine_Test()
	
	{  
		logger.debug(" ....application logs.........");
		logger.info("*** Début Test2 :TC_02_ConnexionRedmine ***");
		
		try {
	
	PageInitialeRedmine hp = new PageInitialeRedmine(driver);
	hp.clickLogin();
	logger.info("cliquer sur le lien de connexion");
	
	PageConnexion_Redmine lp = new PageConnexion_Redmine(driver);
	logger.info("Entrer les données de connexion");
	
	lp.setEmail(rb.getString("email"));
	lp.setPassword(rb.getString("password"));
	lp.clickLogin();
	logger.info("cliquer sur le bouton Connexion");
	
	
	Page_MonCompte_Redmine mac = new Page_MonCompte_Redmine(driver);
	boolean targetpage =  mac.MonCompteExist();
	Assert.assertEquals(targetpage,true);
	logger.info("validation du message attendu");
	}
	catch(Exception e) 
	{
		Assert.fail();
	}
		logger.info("*** Fin Test2 :TC_02_ConnexionRedmine ***");
	}

	
	

}

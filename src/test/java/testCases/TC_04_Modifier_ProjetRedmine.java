
package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.PageAccueil;
import pageObjects.PageAdministration_Redmine;
import pageObjects.PageConfiguration_ProjetRedmine;
import pageObjects.PageConnexion_Redmine;
import pageObjects.PageProjets;


public class TC_04_Modifier_ProjetRedmine extends BaseClass{
	
	@Test
	public void  test_Modifier() throws InterruptedException
	{
		logger.debug(" ....application logs.........");
		logger.info("*** Début Test4 :TC_04_Modifier_ProjetRedmine ***");
		  try
		  {
		PageConnexion_Redmine lp= new PageConnexion_Redmine(driver); 
		logger.info("Entrer les données de connexion");
		
		lp.setEmail("user");
		lp.setPassword("12345678");
		lp.clickLogin();
		logger.info("cliquer sur le bouton Connexion");
		
		PageAccueil hp = new PageAccueil(driver);
		hp.clickAdministration();
		logger.info("cliquer sur le lien Administration");
		
		PageAdministration_Redmine ad =  new PageAdministration_Redmine(driver);
		ad.clickProjets();
		logger.info("cliquer sur le lien Projets");
		
		PageProjets prj  = new PageProjets(driver);
		logger.info("Entrer le nom du projet");
		
		prj.clickRechercheProjet(" ProjetMajdiautomatisation @1255");
		prj.clickAppliquer();
		prj.clickselectProjet();
		logger.info("cliquer sur le bouton Appliquer");
		
		PageConfiguration_ProjetRedmine config = new PageConfiguration_ProjetRedmine(driver);
		config.setDescription("Projet automatisation @1255-modificationTest11");
		config.Sauvegarder();;
		logger.info("cliquer sur le bouton Sauvegarder");
		
		
		String confmsg= config.getConfirmationMsg();
		logger.info("validation du message attendu");
		
		Assert.assertEquals(confmsg, "Mise à jour effectuée avec succès.","Test failed");
		}
		 catch(Exception e)
		{
			 logger.error("Test failed");
			Assert.fail();
		}
		 
		  logger.info("*** Fin Test4 :TC_04_Modifier_ProjetRedmine ***");
	}
	

}
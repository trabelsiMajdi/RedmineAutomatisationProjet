
package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.PageAccueil;
import pageObjects.PageAdministration_Redmine;
import pageObjects.PageConfiguration_ProjetRedmine;
import pageObjects.PageConnexion_Redmine;
import pageObjects.PageNouveau_ProjetRedmine;
import pageObjects.PageProjets;


public class TC_05_Copier_ProjetRedmine extends BaseClass{
	
	@Test
	public void  test_Modifier() throws InterruptedException
	{
		logger.debug(" ....application logs.........");
		logger.info("*** Début Test5 :TC_05_Copier_ProjetRedmine ***");
		 
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
		prj.clickRechercheProjet(" ProjetMajdiautomatisation @1255");
		prj.clickAppliquer();
		prj.clickCopierPojet();
		logger.info("cliquer sur le bouton Copier");
		
		PageNouveau_ProjetRedmine np= new PageNouveau_ProjetRedmine(driver);
		np.setName("copieProjet"+randomeString().toUpperCase());
		np.clickCopier();
		logger.info("Modifier les données du projet");
		
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
		 
		  logger.info("*** Fin Test5 :TC_05_Copier_ProjetRedmine ***");
	}
	

}
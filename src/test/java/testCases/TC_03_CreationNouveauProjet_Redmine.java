
package testCases;


import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.PageAccueil;
import pageObjects.PageConnexion_Redmine;
import pageObjects.PageNouveau_ProjetRedmine;
import pageObjects.PageProjets;



public class TC_03_CreationNouveauProjet_Redmine extends BaseClass{
	@Test
	public void  test_NouveauProjet() throws InterruptedException
	{
		logger.debug(" ....application logs.........");
		logger.info("*** Début Test3 :TC_03_CreationNouveauProjet_Redmine ***");
		  try
		  {
		
	    PageConnexion_Redmine lp= new PageConnexion_Redmine(driver); 
	    logger.info("Fournir les informations de connexion");
	    
		lp.setEmail("user");
		lp.setPassword("12345678");
		lp.clickLogin();
		logger.info("cliquer sur le bouton Connexion");
		
		PageAccueil hp = new PageAccueil(driver);
		hp.clickProjets();
		logger.info("cliquer sur le lien Projets");
		
		PageProjets prj= new PageProjets(driver);
		prj.clickNouvProjet();
		logger.info("cliquer sur le lien Nouveau Projets");
		
		PageNouveau_ProjetRedmine newprojpage = new PageNouveau_ProjetRedmine(driver);
		logger.info("Entrer les données du projet");
		
		newprojpage.setName(randomeString().toUpperCase());
		newprojpage.setDescription(randomeString().toUpperCase());
		newprojpage.setIdentifiant(randomeString().toLowerCase());
		newprojpage.setSiteWeb(randomeString()+".com");
		newprojpage.clickCreer();
		logger.info("cliquer sur le bouton Creer");
		
		String confmsg=newprojpage.getConfirmationMsg();
		logger.info("validation du message attendu");
		
		Assert.assertEquals(confmsg, "Création effectuée avec succès.","Test failed");
		}
		 catch(Exception e)
		{
			 logger.error("Test failed");
			Assert.fail();
		}
		 
		  logger.info("*** Fin Test3 :TC_03_CreationNouveauProjet_Redmine ***");
	}
	
	
}
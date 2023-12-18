package testCases;


import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;




public class BaseClass {

	public static WebDriver driver;
	public Logger logger;
	public ResourceBundle rb;
	
	
	
	
   @BeforeClass
   //@Parameters("browser")
   public void setup()
	{
		logger =LogManager.getLogger(this.getClass());//logging
		rb= ResourceBundle.getBundle("config");//configuration properties file
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(rb.getString("appURL"));
		driver.manage().window().maximize();
		//http://localhost:8083/login?back_url=http%3A%2F%2Flocalhost%3A8083%2F
		
		
	}
	
	
	@AfterClass
    public void tearDown()
	{
		driver.quit();
	}
	
	
	public String randomeString() {
		String generatedString = RandomStringUtils.randomAlphabetic(5);
		return (generatedString);
	}

	public String randomeNumber() {
		String generatedString2 = RandomStringUtils.randomNumeric(10);
		return (generatedString2);
	}
	
	public String randomAlphaNumeric() {
		String st = RandomStringUtils.randomAlphabetic(4);
		String num = RandomStringUtils.randomNumeric(3);
		
		return (st+"@"+num);
	}
	
	public String captureScreen(String tname) throws IOException {

		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
				
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "\\screenshots\\" + tname + "_" + timeStamp + ".png";

		try {
			FileUtils.copyFile(source, new File(destination));
		} catch (Exception e) {
			e.getMessage();
		}
		return destination;

	}
	
}
package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	  
	  public WebDriver OpenChromeBrowser() 
	  {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Shree\\eclipse-workspace\\MavenDecParabank\\TestData\\Browser\\chromedriver1.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://parabank.parasoft.com/");
		 driver.manage().window().maximize();
		 
		 return driver;
		 }
	  
	  public void CloseBrowser(WebDriver driver)
	  {
		  driver.quit();
	  }
	  
	  
	}



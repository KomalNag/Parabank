package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Resources.PropertyFileReader;

public class BaseClass1 {
	PropertyFileReader  p;
	  public WebDriver OpenChromeBrowser() 
	  {
		   p =new PropertyFileReader();
		 System.setProperty("webdriver.chrome.driver",p.getChromePath());
		 WebDriver driver=new ChromeDriver();
	
		driver.get(p.getURL());
		 driver.manage().window().maximize();
		 
		 return driver;
		 }
	  
	  public void CloseBrowser(WebDriver driver)
	  {
		  driver.quit();
	  }

	


	
	  
	  
}

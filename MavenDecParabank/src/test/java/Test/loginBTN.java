package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Browser.BaseClass;
import page.LoginPage;

public class loginBTN {
	WebDriver driver;
	BaseClass base;
	LoginPage login;
	
	@BeforeClass
	public void OpenBrowser()
	{
		base=new BaseClass ();
		driver=base.OpenChromeBrowser();
	}
	
  @Test
 // public void Loginpage() {
//	 LoginPage L=new LoginPage(driver);
	 
//	L.setusername();
//	L.setpassword();
//	 L.setlogin(); 
//  }
  @AfterClass
	public void closebrowser()
	{
		base.CloseBrowser(driver);
	}


	
}


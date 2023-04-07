package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Browser.BaseClass;
import Browser.BaseClass1;
import Error.ScreenShot;
import Resources.PropertyFileReader;
import page.HomePage;
import page.LoginPage;
import page.LoginPage1;


public class NewAccountTest {
	String ActErrormsg;
	WebDriver driver;
	HomePage Home;
	LoginPage1 Login;
	BaseClass1 Base;
	 NewAccountTest na;

	@BeforeClass
	public void OpenBrowser() {
		Base  = new BaseClass1();
		driver=Base.OpenChromeBrowser();
	}
		@BeforeMethod
		public void LoginUser() {
			Login =new LoginPage1(driver);
			Login.setusername();
			Login.setpassword();
			Login.clickOnlogin();
			 
		}
			
	@Test
		 public void createNewAccount() throws IOException {
			try {
				Home = new HomePage(driver);
				Home.clickOnOpenAcccount();
				
			}catch(Exception e) {
				e.printStackTrace();
			ScreenShot s = new ScreenShot();
			s.TakeScreenShot(driver,"1001");
		}			
}
		@AfterMethod
		public void LogOut()
		{
			Home.LogOut();
		}
		@AfterClass
		public void closebrowser()
		{
			Base.CloseBrowser(driver);
		}
		
}

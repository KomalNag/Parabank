package Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Browser.BaseClass;
import page.HomePage;
import page.LoginPage;
import page.RegisterPage;

public class Registration {
	WebDriver driver;
	BaseClass base;
	LoginPage login;
	HomePage home;
	RegisterPage R;
	
	@BeforeClass
	public void OpenBrowser()
	{
		base=new BaseClass ();
		driver=base.OpenChromeBrowser();
	}
	@Test
	public void RegisterUser() throws InterruptedException
	{
	login=new LoginPage(driver);
	login.clickonRegisterBTN();
	
	Thread.sleep(3000);
	R=new RegisterPage(driver);
	 
	  R.setfname();
	  R.setLname();
	  R.setAdd();
	  R.setcity();
	  R.setstate();
	  R.setzip();
	  R.setphone();
	  R.setssn();
	  R.setuname();
	  R.setpwd();
	  R.setcpwd();
	  R.setregisterbtn();
	  Thread.sleep(2000);
	  
	Assert.assertEquals(R.verifyaccountopened(),"Your account was created successfully. You are now logged in.");
	
		home=new HomePage(driver);
		home.LogOut();
	}
	@AfterClass
	public void closebrowser()
	{
		base.CloseBrowser(driver);
	}

	
		
	}

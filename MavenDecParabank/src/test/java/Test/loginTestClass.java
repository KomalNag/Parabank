package Test;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.server.commandhandler.Status;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Browser.BaseClass;
import Error.ScreenShot;
import Excel.ExcelReader;
import page.HomePage;
import page.LoginPage;

public class loginTestClass {
	WebDriver driver;
	HomePage home;
	BaseClass base;
	LoginPage login;
	@BeforeClass
	public void OpenBrowser()
	{
		base=new BaseClass ();
		driver=base.OpenChromeBrowser();
	}
	@DataProvider
	public Object[][] getData() throws IOException
	{
		ExcelReader E= new ExcelReader();
	Object[][]data=E.gettestData("Sheet2","C:\\Users\\Shree\\eclipse-workspace\\MavenDecParabank\\TestData\\ExcelTestData.xlsx")	;
		return data;
	}
	@Test(dataProvider="getData")
	public void LoginUser(String Uname,String PWD, String TCID,String status) throws IOException {
		try {
		login=new LoginPage(driver);
		login.setusername(Uname);
		login.setpassword(PWD);
		login.clickOnlogin();
		System.out.println("Login done successfully");
		
		if(status.equalsIgnoreCase("valid")) {
			home =new HomePage(driver);
			Assert.assertTrue(home.verifyOpenNewAccountOptionIsPresent());
			home.LogOut();
		}
		else {
			String ActualErrormsg=login.getErrormsg();
			
			Assert.assertEquals(ActualErrormsg,"An internal error has occurred and has been logged.");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			ScreenShot s= new ScreenShot();
			
			s.TakeScreenShot(driver,TCID);
			}
	}
	@AfterClass
	public void closebrowser()
	{ base.CloseBrowser(driver);
	}
	}

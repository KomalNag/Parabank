package Test;


import org.testng.Assert;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Browser.BaseClass;
import Error.ScreenShot;
import Excel.ExcelReader;

import page.HomePage;
import page.LoginPage;
import page.RegisterPage2;

public class Test1 {
	WebDriver driver;
	RegisterPage2 R;
	LoginPage Login;
	HomePage Home;
	BaseClass Base;
	
	@BeforeClass
	public void OpenBrowser() {
		Base  = new BaseClass();
		driver=Base.OpenChromeBrowser();
		
	}
	@DataProvider
	public Object[][] getData() throws IOException
	{
		ExcelReader E= new ExcelReader();
		Object[][] data=E.gettestData("Sheet1","C:\\Users\\Shree\\eclipse-workspace\\MavenDecParabank\\TestData\\ExcelTestData.xlsx");		
		return data;
		
	}
	@Test(dataProvider="getData")
	public void UserRegistration(String Fname,String Lname,String Address,String City,String state,String zip,String Phone,String Ssn,String Uname,String PWD,String CPWD,String TCID ) throws IOException {
	try {
		Login =new LoginPage(driver);
		Login.clickonRegisterBTN();
	 
	
	
	 R=new RegisterPage2(driver);
	 
	  R.setfname(Fname);
	  R.setLname(Lname);
	  R.setAdd(Address);
	  R.setcity(City);
	  R.setstate(state);
	  R.setzip(zip);
	  R.setphone(Phone);
	  R.setssn(Ssn);
	  R.setuname(Uname);
	  R.setpwd(PWD);
	  R.setcpwd(CPWD);
	  R.setregisterbtn();
	
	 
	String Actual = R.verifyaccountopened();
	String Expected="Your account was created successfully. You are now logged in.";
	Assert.assertEquals(Actual,Expected);
	Home= new HomePage(driver);
	Home.LogOut();
	}catch(Exception E) {
		E.printStackTrace();
		ScreenShot s= new ScreenShot();
		s.TakeScreenShot(driver, TCID);
	}
	catch(AssertionError a) {
		a.printStackTrace();
		ScreenShot s= new ScreenShot();
		s.TakeScreenShot(driver, TCID);
	}
	
	
	

}
@AfterClass
public void closebrowser()
{
	Base.CloseBrowser(driver);
}
}

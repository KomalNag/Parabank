package page;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resources.PropertyFileReader;

public class LoginPage {
	@FindBy(xpath="//input[@type='text']") private WebElement UN ;
	@FindBy(xpath="//input[@type='password']") private WebElement PWD;
	@FindBy(xpath="//input[@type='submit']") private WebElement Login;
	@FindBy(xpath="//a[text()='Register']") private WebElement Register ;
	@FindBy(xpath="//P[text()=\"An internal error has occurred and has been logged.\"]") private WebElement Errormsg;
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
//usage
	
	public void clickonRegisterBTN()
	{
	Register.click();
	}

	public void setusername(String uname)
	{
		UN.sendKeys("uname");
		
	}
	public void setpassword(String pwd)
	{
		PWD.sendKeys("pwd");
		
	}
	public void clickOnlogin() {
		Login.click();
	}

	public String getErrormsg() {
		String actual= Errormsg.getText();
		return actual;
		
		
	}
}

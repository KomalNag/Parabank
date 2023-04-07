package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resources.PropertyFileReader;

public class LoginPage1 {
	@FindBy(xpath="//input[@type='text']") private WebElement UN ;
	@FindBy(xpath="//input[@type='password']") private WebElement PWD;
	@FindBy(xpath="//input[@type='submit']") private WebElement Login;
	@FindBy(xpath="//a[text()='Register']") private WebElement Register ;
	@FindBy(xpath="//P[text()=\"An internal error has occurred and has been logged.\"]") private WebElement Errormsg;
	
	
	public LoginPage1(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	PropertyFileReader p= new PropertyFileReader();
	
//usage
	
	public void clickonRegisterBTN()
	{
	Register.click();
	}

	public void setusername()
	{
		UN.sendKeys(p.getUserName());
		
	}
	public void setpassword()
	{
		PWD.sendKeys(p.getpassword());
		
	}
	public void clickOnlogin() {
		Login.click();
	}

	public String getErrormsg() {
		String actual= Errormsg.getText();
		return actual;
		

} }

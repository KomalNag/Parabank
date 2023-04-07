package page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	//Declaration
	
		@FindBy(id="customer.firstName") private WebElement firstName;
		@FindBy(id="customer.lastName") private WebElement LastName;
		@FindBy(id="customer.address.street") private WebElement Address ;
		@FindBy(id="customer.address.city") private WebElement city ;
		@FindBy(id="customer.address.state") private WebElement State ;
		@FindBy(id="customer.address.zipCode") private WebElement zipcode;
		@FindBy(id="customer.phoneNumber") private WebElement phonenumber ;
		@FindBy(id="customer.ssn") private WebElement ssn ;
		@FindBy(id="customer.username") private WebElement  Username;
		@FindBy(id="customer.password") private WebElement password  ;
		@FindBy(id="repeatedPassword") private WebElement confirmpwd ;
		@FindBy(xpath="(//input[@type='submit'])[2]") private WebElement  registerbtn ;
		@FindBy(xpath="//p[contains(text(),'logged in')]")private WebElement verificationMSG;
		
		
		//init
		public RegisterPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}	
		//usage
		
		
		public void setfname()
		{
			firstName.sendKeys("komal ");
		}
		public void setLname()
		{
			LastName.sendKeys("nagawade");
		}
		public void setAdd()
		{
			Address.sendKeys("hadapsar");
		}
		public void setcity()
		{
			city.sendKeys("pune");
		}
		public void setstate()
		{
			State.sendKeys("maharashtra");
		}
		public void setzip()
		{
			zipcode.sendKeys("412308");
		}
		public void setphone()
		{
			phonenumber.sendKeys("9527028918");
		}
		public void setssn()
		{
			ssn.sendKeys("1234567890");
		}
		
		public void setuname()
		{
			Username.sendKeys("Abcdefg123");
		}
		public void setpwd()
		{
			password.sendKeys("abfg45");
		}
		public void setcpwd()
		{
			confirmpwd.sendKeys("abfg45");
		}
		public void setregisterbtn()
		{
			registerbtn.click();
			
		}
		public String verifyaccountopened()
		{
			String actual=verificationMSG.getText();
			return actual;
		}
		
		
	}


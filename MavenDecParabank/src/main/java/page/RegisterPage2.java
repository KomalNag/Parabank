package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage2 {
	
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
			public RegisterPage2(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}	
			//usage
			
			
			public void setfname(String Fname)
			{
				firstName.sendKeys(Fname);
			}
			public void setLname(String Lname)
			{
				LastName.sendKeys(Lname);
			}
			public void setAdd(String address)
			{
				Address.sendKeys(address);
			}
			public void setcity(String City)
			{
				city.sendKeys(City);
			}
			public void setstate(String state)
			{
				State.sendKeys(state);
			}
			public void setzip(String Zip)
			{
				zipcode.sendKeys(Zip);
			}
			public void setphone(String Phone)
			{
				phonenumber.sendKeys(Phone);
			}
			public void setssn(String Ssn)
			{
				ssn.sendKeys(Ssn);
			}
			
			public void setuname(String Uname)
			{
				Username.sendKeys(Uname);
			}
			public void setpwd(String PWD)
			{
				password.sendKeys(PWD);
			}
			public void setcpwd(String CPWD)
			{
				confirmpwd.sendKeys(CPWD);
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

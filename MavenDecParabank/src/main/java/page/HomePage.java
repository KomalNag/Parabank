package page;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class HomePage
	{
	    //declaration
		@FindBy(xpath="//a[text()=\"Open New Account\"]") private WebElement OpenNewAccount;
		@FindBy(xpath="//a[text()='Request Loan']")private WebElement loanregues;
		@FindBy(xpath="//a[text()='Log Out']")private WebElement logout;
		//init
		public HomePage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//usage
		public void LogOut()
		{
			logout.click();
			}

		

		public boolean verifyOpenNewAccountOptionIsPresent() {
			boolean result=OpenNewAccount.isDisplayed();
			
			
			return result;
		}

		public void clickOnOpenAcccount() {
			OpenNewAccount.click();
			
		}
		}
		
	



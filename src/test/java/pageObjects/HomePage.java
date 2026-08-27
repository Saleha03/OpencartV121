package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage  extends BasePage{
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	//div[@class='col text-end']/ul/li[2]
	//span[contains(text(), 'My Account')]
	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement lnkMyAccount;
	
	
	//a[contains(text(), 'Register')]/preceding::ul[@class='dropdown-menu dropdown-menu-right']
	@FindBy(xpath="//a[@class='dropdown-item'][normalize-space()='Register']")
	WebElement lnkRegistration;
	
	//Login
	//ul[@class='dropdown-menu dropdown-menu-right show']/descendant::a[contains(text(),"Login")]
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right show']/descendant::a[contains(text(),\"Login\")]")
	WebElement linkLogin;
	
	public void clickMyAccount() {
		
		lnkMyAccount.click();
		
	}
	
	public void clickRegistration() {
		
		lnkRegistration.click();
	}
	
	public void clickLogin() {
		linkLogin.click();
	}

}

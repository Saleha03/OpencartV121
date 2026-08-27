package pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountRegistrationPage extends BasePage {
	
	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
	}
	

	@FindBy(xpath="//input[@id=\"input-firstname\"]")
	WebElement txtFirstname;
	
	@FindBy(xpath="//input[@id=\"input-lastname\"]")
	WebElement txtlastname;
	
	@FindBy(xpath="//input[@id=\"input-email\"]")
	WebElement txtEmail;
	
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@id='input-newsletter']")
	WebElement chkSubscribe;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement chkPolicy;
	
	@FindBy(xpath="//button[contains(text(),'Continue')]")
	WebElement btnContinue;
	
	
	public void setFirstName(String fname) {
		txtFirstname.sendKeys(fname);
	}
	
	public void setLastName(String lname) {
		txtlastname.sendKeys(lname);
	}
	
	
	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}
	
	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}
	
	
	
		
	public void setSubscribe() {

	    JavascriptExecutor js = (JavascriptExecutor) driver;

	    js.executeScript("arguments[0].scrollIntoView({block: 'center'});",chkSubscribe);

	    js.executeScript("arguments[0].click();",chkSubscribe);
	}
	
	
	
	public void setPrivacyPolicy() {
		chkPolicy.click();
	}
	
	public void clickContinue() {
		btnContinue.click();
		
		//btnContinue.submit();
		
		
		//Actions act=new Actions(driver);
		//act.moveToElement(btnContinue).click().perform();
		
		//JavascriptExecuter js=(JavaScriptExecuter)driver;
		//js.executeScript("argument[0].click",btnContinue);
		
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.elementToBeClickable(btnContinue)).click();
	}
	
	
	

}

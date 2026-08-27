package testCases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_AccountregistrationTest extends BaseClass {

	@Test(groups={"Regression","Master"})
	public void verify_account_registration() {
		
		logger.info("****Starting TC001_AccountregistrationTest *****");
		
		try
		{
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		logger.info("Clicked on MyAccout Link");
		
		hp.clickRegistration();
		logger.info("Clicked on Registration Link");
		
		AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
		logger.info("Providing cutomer details...");
		
		regpage.setFirstName(randomString().toUpperCase());
		regpage.setLastName(randomString().toUpperCase());
		regpage.setEmail(randomString()+"@gmail.com");
		regpage.setPassword(randomAlphaNumeric());
		regpage.setSubscribe();
		regpage.setPrivacyPolicy();
		regpage.clickContinue();
		}
		catch(Exception e) {
			logger.error("Test Failed..");
			logger.debug("Debug logs...");
			Assert.fail();
		}
		logger.info("****Finished TC001_AccountregistrationTest *****");
	
			
		
	}
	
	
	
}

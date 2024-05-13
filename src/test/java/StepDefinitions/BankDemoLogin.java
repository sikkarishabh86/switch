package StepDefinitions;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import PageObjects.LoginPage;
import baseSetup.BaseSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import utilities.PropertyFileReader;

public class BankDemoLogin {
	LoginPage loginPage = new LoginPage();
	Logger logger = LogManager.getLogger("BankDemoLogin");	
	BaseSetup bSetup = new BaseSetup();
	PropertyFileReader pfr = new PropertyFileReader();
	
	@Given("Browser is open and user enter the url")
	public void browser_is_open_and_user_enter_the_url() {
	   bSetup.driver().get(pfr.propertyFileReader().getProperty("url"));
	   logger.info("url opened successfully");
	}

	@Then("user is navigated to the login page")
	public void user_is_navigated_to_the_login_page() {
	    String currurl = bSetup.driver().getCurrentUrl();
	    String expurl = pfr.propertyFileReader().getProperty("url");
	    
	    Assert.assertEquals(expurl, currurl);
	}
	
	@When("user enters the valid username")
	public void user_enters_the_valid_username() {
	    try {
			loginPage.userId().sendKeys(pfr.propertyFileReader().getProperty("userid"));
			logger.info("UserId entered successfully");
		} catch (Exception e) {
			logger.error(e);
		}
	}

	@And("user enters the valid password")
	public void user_enters_the_valid_password() {
	    loginPage.password().sendKeys(pfr.propertyFileReader().getProperty("password"));
	}

	@And("user clicks on login button")
	public void user_clicks_on_login_button() throws InterruptedException {
	    loginPage.loginButton().click();
	    Thread.sleep(10000);
	}

	@Then("user is redirected to the homepage.")
	public void user_is_redirected_to_the_homepage() {
		String currHomePage = bSetup.driver().getCurrentUrl();
		String expHomePage = pfr.propertyFileReader().getProperty("homepage");
		
		Assert.assertEquals(expHomePage, currHomePage);
	}

}

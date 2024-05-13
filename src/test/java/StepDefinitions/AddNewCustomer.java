package StepDefinitions;

import java.text.ParseException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import baseSetup.BaseSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import utilities.Corefunctions;
import utilities.PropertyFileReader;

public class AddNewCustomer {
	
	LoginPage loginPage = new LoginPage();
	Logger logger = LogManager.getLogger("AddNewCustomer");	
	BaseSetup bSetup = new BaseSetup();
	PropertyFileReader pfr = new PropertyFileReader();
	HomePage homePage = new HomePage();
	Corefunctions corefunctions = new Corefunctions();
	
	@When("user clicks on New Customer link")
	public void user_clicks_on_new_customer_link() {
//	    corefunctions.click(homePage.newCustomerLink(), "New Customer Link");
//	    logger.info("User clicked successfully on new customer link");
//	    WebElement iframe1 = bSetup.driver().findElement(By.xpath("//iframe[contains(@id,'google_ads_iframe')]"));
//	    WebElement iframe2 = bSetup.driver().findElement(By.xpath("//iframe[@id='ad_iframe']"));
//	    
//	    bSetup.driver().switchTo().frame(iframe1);
//	    bSetup.driver().switchTo().frame(iframe2);
//	    bSetup.driver().findElement(By.xpath("//*[@id=\"dismiss-button\"]")).click();
		
		bSetup.driver().get(pfr.propertyFileReader().getProperty("addCustomerPage"));
	}
	@Then("user get redirected to Add New Customer page")
	public void user_get_redirected_to_add_new_customer_page() {
	    String currUrl = bSetup.driver().getCurrentUrl();
	    String expUrl = pfr.propertyFileReader().getProperty("addCustomerPage");
	    Assert.assertEquals(expUrl, currUrl);
	    logger.info("User redirected to Add new customer page");
	    
	}
	@And("user fills the Customer Name")
	public void user_fills_the_customer_name() {
	    corefunctions.sendKeys(homePage.inputCustomerName(), "Rishabh", "Customer Name"
	    		+ "");
	}
	@And("user selects male gender")
	public void user_selects_female_gender() {
	    corefunctions.click(homePage.radioFemale(), "Female radio button");
	    corefunctions.click(homePage.radioMale(), "Male radio button");
	}
	@And("user enters date of birth")
	public void user_enters_date_of_birth() throws ParseException {
	    corefunctions.sendKeys(homePage.inputDateOfBirth(), corefunctions.dateMaker(31), "Date of Birth");
	    
	}
	
	@And("user enters the address")
	public void user_enters_the_address() {
	    corefunctions.sendKeys(homePage.textareaAddress(), pfr.propertyFileReader().getProperty("Address"), "Address");
	}
	
	@And("user enters the city")
	public void user_enters_the_city() {
	    corefunctions.sendKeys(homePage.inputCity(), pfr.propertyFileReader().getProperty("city"), "City");
	}
	@And("user enter the state")
	public void user_enter_the_state() {
		 corefunctions.sendKeys(homePage.inputState(), pfr.propertyFileReader().getProperty("state"), "State");
	}
	@And("user enter the PIN")
	public void user_enter_the_pin() {
		 corefunctions.sendKeys(homePage.inputPIN(), pfr.propertyFileReader().getProperty("PIN"), "PIN");
	}
	@And("user enters the mobile number")
	public void user_enters_the_mobile_number() {
		 corefunctions.sendKeys(homePage.inputMobileNumber(), corefunctions.randomMobileNumber(), "Mobile Number");
	}
	@And("user enters the email id")
	public void user_enters_the_email_id() {
	    corefunctions.sendKeys(homePage.inputEmail(), corefunctions.randomEmailAddress(), "Email Id");
	}
	@And("user enters the password")
	public void user_enters_the_password() {
	    corefunctions.sendKeys(homePage.inputPassword(), pfr.propertyFileReader().getProperty("password"), "Password");
	}
	@And("user clicks on submit button")
	public void user_clicks_on_submit_button() {
	    corefunctions.click(homePage.inputSubmitButton(), "Submit button");
	}


}

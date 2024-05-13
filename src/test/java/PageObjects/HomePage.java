package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseSetup.BaseSetup;

public class HomePage {
	
	BaseSetup baseSetup = new BaseSetup();
	
	public WebElement newCustomerLink() {
		WebElement newCustomerLink = baseSetup.driver().findElement(By.xpath("//a[normalize-space()='New Customer']"));
		return newCustomerLink;
	}
	
	public WebElement inputCustomerName() {
		WebElement inputCustomerNamElement = baseSetup.driver().findElement(By.xpath("//td[text()='Customer Name']/../td/input"));
		return inputCustomerNamElement;
	}
	
	public WebElement radioFemale() {
		WebElement radioFemale = baseSetup.driver().findElement(By.xpath("//input[@value='f']"));
		return radioFemale;
	}
	
	public WebElement radioMale() {
		WebElement radioFemale = baseSetup.driver().findElement(By.xpath("//input[@value='m']"));
		return radioFemale;
	}	
	
	public WebElement inputDateOfBirth() {
		WebElement inputDateOfBirth = baseSetup.driver().findElement(By.xpath("//input[@id='dob']"));
		return inputDateOfBirth;
	}
	
	public WebElement textareaAddress() {
		WebElement textareaAddress = baseSetup.driver().findElement(By.xpath("//textarea[@name='addr']"));
		return textareaAddress;
	}
	
	public WebElement inputCity() {
		WebElement inputCity = baseSetup.driver().findElement(By.xpath("//input[@name='city']"));
		return inputCity;
	}
	
	public WebElement inputState() {
		WebElement inputState = baseSetup.driver().findElement(By.xpath("//input[@name='state']"));
		return inputState;
	}
	
	public WebElement inputPIN() {
		WebElement inputPIN = baseSetup.driver().findElement(By.xpath("//input[@name='pinno']"));
		return inputPIN;
	}
	
	public WebElement inputMobileNumber() {
		WebElement inputMobileNumber = baseSetup.driver().findElement(By.xpath("//input[@name='telephoneno']"));
		return inputMobileNumber;
	}
	
	public WebElement inputEmail() {
		WebElement inputEmail = baseSetup.driver().findElement(By.xpath("//input[@name='emailid']"));
		return inputEmail;
	}
	
	public WebElement inputPassword() {
		WebElement inputPassword = baseSetup.driver().findElement(By.xpath("//input[@name='password']"));
		return inputPassword;
	}
	
	public WebElement inputSubmitButton() {
		WebElement inputSubmitButton = baseSetup.driver().findElement(By.xpath("//input[@name='sub']"));
		return inputSubmitButton;
	}
	

}

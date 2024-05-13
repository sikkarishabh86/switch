package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import baseSetup.BaseSetup;

public class LoginPage {
	
	BaseSetup baseSetup = new BaseSetup();
	
	public WebElement userId() {
		WebElement userId = baseSetup.driver().findElement(By.xpath("//input[@name='uid']"));
		return userId;
	}
	
	public WebElement password() {
		WebElement password = baseSetup.driver().findElement(By.xpath("//input[@name='password']"));
		return password;
	}
	
	public WebElement loginButton() {
		WebElement loginButton = baseSetup.driver().findElement(By.xpath("//input[@name='btnLogin']"));
		return loginButton;
	}

}

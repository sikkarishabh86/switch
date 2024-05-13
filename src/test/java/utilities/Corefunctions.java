package utilities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.github.javafaker.Faker;

public class Corefunctions {
	Logger logger = LogManager.getLogger("Corefunctions");	
	
	public void click(WebElement element, String name) {
		try {
			element.click();
			logger.info(name+" clicked successfully");
			
		} catch (Exception e) {
			logger.error(e);
		}
	}
	
	public void sendKeys(WebElement element, String text, String name) {
		try {
			element.sendKeys(text);
			logger.info(text+" entered successfully in element "+name);
		} catch (Exception e) {
			logger.error(e);
		}
	}
	
	public String dateMaker(int age) throws ParseException {
		
		LocalDate currDate = LocalDate.now();
		LocalDate pastDate = currDate.minusYears(age);
		
		SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = inputFormat.parse(pastDate.toString());
		
		SimpleDateFormat outputFormat = new SimpleDateFormat("dd-MM-yyyy");
		String formattedDate = outputFormat.format(date);
		
		return formattedDate;
	}
	
	public String randomMobileNumber() {
		long min = 1_000_000_000L; // Minimum 10-digit number
        long max = 9_999_999_999L; // Maximum 10-digit number
        long randomNumber = (long) (min + Math.random() * (max - min + 1));
		return Long.toString(randomNumber);
	}
	
	public String randomEmailAddress() {
		Faker faker = new Faker();
		String emailId = faker.internet().emailAddress();
		return emailId;
	}
	
	

}

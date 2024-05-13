package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import utilities.PropertyFileReader;

public class Test {
	
	static PropertyFileReader pfr = new PropertyFileReader();
	
	public static void main(String[] args) throws ParseException {
		long min = 1_000_000_000L; // Minimum 10-digit number
        long max = 9_999_999_999L; // Maximum 10-digit number
        long randomNumber = (long) (min + Math.random() * (max - min + 1));
        System.out.println("Random 10-digit number: " + randomNumber);
	}

}

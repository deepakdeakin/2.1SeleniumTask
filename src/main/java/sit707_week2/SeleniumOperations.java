package sit707_week2;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;

/**
 * This class demonstrates Selenium locator APIs to identify HTML elements.
 * 
 * Details in Selenium documentation https://www.selenium.dev/documentation/webdriver/elements/locators/
 * 
 * @author Deepak Kumar Khatri
 */
public class SeleniumOperations {

	public static void sleep(int sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void officeworks_registration_page(String url) {
		// Step 1: Locate chrome driver folder in the local drive.
		System.setProperty("webdriver.chrome.driver", "/Users/deepak/Downloads/chromedriver-mac-arm64/chromedriver");
		
		// Step 2: Use above chrome driver to open up a chromium browser.
		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Driver info: " + driver);
		
		sleep(2);
	
		// Load a webpage in chromium browser.
		driver.get(url);
		
		/*
		 * How to identify a HTML input field -
		 * Step 1: Inspect the webpage, 
		 * Step 2: locate the input field, 
		 * Step 3: Find out how to identify it, by id/name/...
		 */
		
		// Find first input field which is firstname
		WebElement firstName = driver.findElement(By.id("firstname"));
		System.out.println("Found element: " + firstName);
		// Send first name
		firstName.sendKeys("Deepak Kumar");
		
		/*
		 * Find following input fields and populate with values
		 */
		// Write code

		// Find the input field which is Last Name
		
		WebElement lastName = driver.findElement(By.id("lastname"));
		System.out.println("Found element: " + lastName);
		//send Last name
		lastName.sendKeys("Khatri");
		
		// Find the input field which is Phone Number
		
		WebElement phoneNumber = driver.findElement(By.id("phoneNumber"));
		System.out.println("Found element: " + phoneNumber);
		//send Phone Number
		phoneNumber.sendKeys("0787444890");
		
		// Find the input field which is Email
		WebElement email = driver.findElement(By.id("email"));
		System.out.println("Found element: " + email);
		//send email
		email.sendKeys("deep.khatri40@gmail.com");
		
		// Find the input field which is Password
		WebElement password = driver.findElement(By.id("password"));
		System.out.println("Found element: " + password);
		//send Password
		password.sendKeys("Hello3!");
		
		// Find the input field which is ConfirmPassword
		WebElement confirmPassword = driver.findElement(By.id("confirmPassword"));
		System.out.println("Found element: " + confirmPassword);
		//send Password
		confirmPassword.sendKeys("Hello3!");
		
		//Find the Button Field
		WebElement buttonClick = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/form/div[10]/div/button[1]"));
		System.out.println("Found element: " + buttonClick);
		//send Button Click
		//buttonClick.click();
		
		
		
		WebElement createAccount = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/form/div[12]/button"));
		System.out.println("Found element: " + createAccount);
		//send Button Click
		createAccount.click();
		
		 // Take the screenshot
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // Save the screenshot to a file
        try {
            // Copy the screenshot file to a desired location
            // Replace "screenshot.png" with the desired filename and path
            screenshotFile.renameTo(new File("screenshotFirstPage.png"));
            System.out.println("Screenshot saved successfully.");
        } catch (Exception e) {
            System.out.println("Failed to save screenshot: " + e.getMessage());
        }

		
		
		
		// Sleep a while
		sleep(2);
		
		// close chrome driver
		driver.close();	
	}
	
	
	
	public static void ynab_create_page(String url) {
		
		// Step 1: Locate chrome driver folder in the local drive.
				
		System.setProperty("webdriver.chrome.driver", "/Users/deepak/Downloads/chromedriver-mac-arm64/chromedriver");
		
		// Step 2: Use above chrome driver to open up a chromium browser.
		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Driver info: " + driver);
		
		sleep(2);
	
		// Load a webpage in chromium browser.
		driver.get(url);
		
		//Find the cookie button and click it
		WebElement cookieButton = driver.findElement(By.id("onetrust-accept-btn-handler"));
		System.out.println("Found element: " + cookieButton);
		//send Button Click
		cookieButton.click();
		
		// Find first input field which is Email
		WebElement emailAddress = driver.findElement(By.id("request_data_email_signup"));
		System.out.println("Found element: " + emailAddress);
		// Send Email
		emailAddress.sendKeys("deep.khatri40@gmail.com");		
		
		// Find first input field which is Password
		WebElement password = driver.findElement(By.id("request_data_password_signup"));
		System.out.println("Found element: " + password);
		// Send Password
		password.sendKeys("1");
		
		WebElement createAccount = driver.findElement(By.id("sign_up"));
		System.out.println("Found element: " + createAccount);
		//send Button Click
		createAccount.click();
		
		
		
		
		 // Take the screenshot
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // Save the screenshot to a file
        try {
            // Copy the screenshot file to a desired location
            // Replace "screenshot.png" with the desired filename and path
            screenshotFile.renameTo(new File("screenshotSecondPage.png"));
            System.out.println("Screenshot saved successfully.");
        } catch (Exception e) {
            System.out.println("Failed to save screenshot: " + e.getMessage());
        }
        
     // Sleep a while
     		sleep(2);
     		
   // close chrome driver
     		driver.close();	
	}
	
	
}

package SeleniumWebDriver.secondLesson;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentWaitCode {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Test Engineer\\Eclipse IDE\\Workspace\\SeleniumLibrary\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		driver.findElement(By.className("dropbtn")).click();
		
		
		// Waiting 30 seconds for an element to be present on the page, checking
		// for its presence once every 5 seconds.
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	       .withTimeout(Duration.ofSeconds(30L))	// wait upto 30 sec
	       .pollingEvery(Duration.ofSeconds(5L))	// Check the data every 5 second
	       .ignoring(NoSuchElementException.class);

		WebElement gmail = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.linkText("Gmail"));	// give the element locator here
	     }
	   });
		//Click the fluent wait element
		gmail.click();
		
		// Wait 		-> import org.openqa.selenium.support.ui.Wait;
		// FluentWait	-> import org.openqa.selenium.support.ui.FluentWait;
		//NoSuchElementException -> import org.openqa.selenium.NoSuchElementException;
		//WebElement	-> import org.openqa.selenium.WebElement;
		//Function		-> import com.google.common.base.Function;
		
		Thread.sleep(5000);
		driver.quit();
	}	

}

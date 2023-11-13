package SeleniumWebDriver.ThirdLesson;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TabButtonUse {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement userName = driver.findElement(By.cssSelector("input[name='userid']"));
		
		userName.sendKeys("dr.mifta");
		
		Thread.sleep(5000);
		
		action
		.sendKeys(Keys.TAB)
		.sendKeys("password")
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.ENTER)
		.build()
		.perform();
		
		//This Code will Provide Username First Then press Tab than Provide password then press tab then press enter to log in.
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}

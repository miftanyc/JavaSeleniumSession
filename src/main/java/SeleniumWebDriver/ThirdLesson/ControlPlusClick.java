package SeleniumWebDriver.ThirdLesson;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ControlPlusClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		WebElement link = driver.findElement(By.linkText("compendiumdev"));
		
		action
			.keyDown(Keys.CONTROL)
			.click(link)
			.keyUp(Keys.CONTROL)
			.build().perform();
		
		Thread.sleep(10000);
		
		//Quit the browser
		driver.quit();		

	}

}

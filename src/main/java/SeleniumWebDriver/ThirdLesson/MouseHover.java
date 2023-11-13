package SeleniumWebDriver.ThirdLesson;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://omayo.blogspot.com/");
		
		WebElement blogmenu = driver.findElement(By.cssSelector("[id=\"blogsmenu\"]"));
		WebElement selenium143 = driver.findElement(By.xpath("//span[text()='Selenium143']"));
		
		Actions action = new Actions(driver);
		
		Thread.sleep(3000);
		action.moveToElement(blogmenu).perform();
		
		Thread.sleep(3000);
		action.moveToElement(selenium143).click().build().perform();
		
		Thread.sleep(3000);
		driver.quit();
	}

}

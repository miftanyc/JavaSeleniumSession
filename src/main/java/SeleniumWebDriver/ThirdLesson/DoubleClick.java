package SeleniumWebDriver.ThirdLesson;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//Create a CRV for Actions Class
		Actions action = new Actions(driver);
		
		//Find the Element to double Click
		WebElement element = driver.findElement(By.cssSelector("input[class='gsc-input']"));
		element.sendKeys("MIFTA");
		
		Thread.sleep(3000);
		action.doubleClick(element).perform();

		
		
		Thread.sleep(5000);
		driver.quit();
		
		
		
		
		
		
		

	}

}

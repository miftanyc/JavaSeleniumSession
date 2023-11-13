package SeleniumWebDriver.fourthLesson;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoSuggestiveDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		Thread.sleep(5000);
		//Simulate Mouse Actio to Click Make My Trip Logo
		WebElement logo = driver.findElement(By.cssSelector("img[src='//imgak.mmtcdn.com/pwa_v3/pwa_hotel_assets/header/mmtLogoWhite.png']"));
			//Create a Action Class
			Actions action = new Actions(driver);
			action.moveToElement(logo).click().build().perform();
			
		
		//Select Element from AutoSuggestive DropDown
		WebElement element = driver.findElement(By.cssSelector("input[id='fromCity']"));
		element.sendKeys("ny");
		Thread.sleep(3000);
		
		for (int i=0; i<3; i++) {
			Thread.sleep(2000);
			action.sendKeys(Keys.DOWN).perform();
			}
		action.sendKeys(Keys.ENTER).perform();
		
		
		
		//quit the browser
		driver.quit();
	}

}

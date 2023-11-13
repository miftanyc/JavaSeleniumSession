package SeleniumWebDriver.fourthLesson;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingCalendar {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companion/");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions action = new Actions(driver);
		
		action.sendKeys(Keys.PAGE_DOWN).perform();
		//open the calander
		Thread.sleep(2000);
		WebElement calander = driver.findElement(By.cssSelector("input[id='form-field-travel_comp_date']"));
		calander.click();
		

		
		//Selecting December as Month	
		Thread.sleep(2000);
		while(!driver.findElement(By.cssSelector("span[class='cur-month']")).getText().contains("December")) {
			driver.findElement(By.cssSelector("span[class='flatpickr-next-month']")).click();
			Thread.sleep(2000);
		}
		
		
		//Element to identify Days
		Thread.sleep(2000);
		List<WebElement> days = driver.findElements(By.cssSelector("span[class='flatpickr-day ']"));
		
		for(int i =0; i<days.size(); i++) {
			if(days.get(i).getText().contains("19")) {
				days.get(i).click();
				break;
			}		
		}
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
	}
}

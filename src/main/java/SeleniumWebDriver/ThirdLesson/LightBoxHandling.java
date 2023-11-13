package SeleniumWebDriver.ThirdLesson;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LightBoxHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://omayo.blogspot.com/p/lightbox.html");
		
		driver.findElement(By.id("lightbox1")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".close.cursor"));
		Thread.sleep(3000);
		
		driver.quit();
		
		
	}
}

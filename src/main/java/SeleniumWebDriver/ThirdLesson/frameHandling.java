package SeleniumWebDriver.ThirdLesson;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Test Engineer\\Eclipse IDE\\Workspace\\SeleniumLibrary\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Thread.sleep(3000);
		WebElement frame = driver.findElement(By.cssSelector("iframe[src='data:image/gif;base64,R0lGODlhAQABAAAAACH5BAEKAAEALAAAAAABAAEAAAICTAEAOw==']"));
		driver.switchTo().frame(frame);
		Thread.sleep(2000);
		
		WebElement selenium = driver.findElement(By.xpath("//a[@href='https://www.globalsqa.com/training/selenium-online-training/']"));
		selenium.click();
		Thread.sleep(5000);
		
		driver.switchTo().defaultContent();
		List<WebElement> cheetsheet = driver.findElements(By.xpath("//li[@id='menu-item-6898']/a[@href='https://www.globalsqa.com/cheatsheets/']"));
		Iterator<WebElement> itr = cheetsheet.iterator();
		
		cheetsheet.get(0).click();
		
		//or
//		WebElement element1 = itr.next();
//		element1.click();
		
		//Find out how many iframe present in this website?
		System.out.println("Number of frame present in this website: "+driver.findElements(By.tagName("iframe")).size());
		
		
		Thread.sleep(5000);
		driver.quit();
	}

}

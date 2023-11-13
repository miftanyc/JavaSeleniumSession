package SeleniumWebDriver.secondLesson;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownAndMultiselectBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Test Engineer\\Eclipse IDE\\Workspace\\SeleniumLibrary\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Selecting Drowdown Option
		WebElement ddown = driver.findElement(By.id("drop1"));
		Select ddownSelect = new Select(ddown);
		ddownSelect.selectByVisibleText("doc 3");
		
		
		//Selecting Multiselect box
		WebElement multibox = driver.findElement(By.id("multiselect1"));
		Select multiboxSelect = new Select(multibox);
		multiboxSelect.selectByVisibleText("Volvo");
		multiboxSelect.selectByVisibleText("Hyundai");
		
 		
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}

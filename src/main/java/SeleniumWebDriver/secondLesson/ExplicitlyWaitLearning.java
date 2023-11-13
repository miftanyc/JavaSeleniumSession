package SeleniumWebDriver.secondLesson;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ExplicitlyWaitLearning {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Test Engineer\\Eclipse IDE\\Workspace\\SeleniumLibrary\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://omayo.blogspot.com/");
		
		driver.manage().window().maximize();
	//	Set Implicit wait default for 1 sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		
		
		driver.findElement(By.className("dropbtn")).click();
		
	//	set Explecit wait for 30 second for gmail click
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement elementgmail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Gmail")));
		elementgmail.click();
		
		
		Thread.sleep(10000);
		driver.quit();

	}

}

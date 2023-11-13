package SeleniumWebDriver.secondLesson;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertManagement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Test Engineer\\Eclipse IDE\\Workspace\\SeleniumLibrary\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("alert1")).click();
		
		Thread.sleep(3000);
		Alert alertwindow = driver.switchTo().alert();
		
		String text = alertwindow.getText();
		
		System.out.println(text);
		alertwindow.accept();
		
		Thread.sleep(3000);
		driver.quit();
		
	}
}

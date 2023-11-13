package SeleniumWebDriver.secondLesson;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWaitLearning {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Test Engineer\\Eclipse IDE\\Workspace\\SeleniumLibrary\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	//	Open the URL
		driver.get("http://omayo.blogspot.com/");
		
	//	Maximize the Window
		driver.manage().window().maximize();
		
	//	Implicit Wait for 10 Second
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	//	Click the Dropdown button
		driver.findElement(By.className("dropbtn")).click();
		
	//	Select the FaceBook Dropdown
		driver.findElement(By.linkText("Facebook")).click();
				
	//	Wait for 10 Second before browser quit
		Thread.sleep(10000);
		driver.quit();
	}

}

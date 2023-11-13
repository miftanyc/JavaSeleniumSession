package SeleniumWebDriver.ThirdLesson;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CtrlPlusA {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		WebElement textbox = driver.findElement(By.cssSelector("[id='ta1']"));
		
		textbox.sendKeys("This is mifta chowdhury "
				+ "I am the code writer of this code "
				+ "This code is the masterpiece of i have written in "
				+ "It memorable becuase i am learning it ");
		
		Thread.sleep(5000);

		//Undo the process
		textbox.sendKeys(Keys.chord(Keys.CONTROL, "z"));
		

	}

}

package SeleniumWebDriver.ThirdLesson;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	static WebDriver driver = new ChromeDriver();
	static Actions action = new Actions(driver);

	public static void main(String[] args) throws InterruptedException {
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Identify The Element of Capital (Source)
		WebElement oslo = driver.findElement(By.id("box1"));
		WebElement Stockholm = driver.findElement(By.id("box2"));
		WebElement Washington = driver.findElement(By.id("box3"));
		WebElement Copenhagen = driver.findElement(By.id("box4"));
		WebElement Seoul = driver.findElement(By.id("box5"));
		WebElement Rome = driver.findElement(By.id("box6"));
		WebElement Madrid = driver.findElement(By.id("box7"));

		// Identify The Element of Country (Target)
		WebElement Norway = driver.findElement(By.id("box101"));
		WebElement Sweden = driver.findElement(By.id("box102"));
		WebElement UnitedStates = driver.findElement(By.id("box103"));
		WebElement Denmark = driver.findElement(By.id("box104"));
		WebElement SouthKorea = driver.findElement(By.id("box105"));
		WebElement Italy = driver.findElement(By.id("box106"));
		WebElement Spain = driver.findElement(By.id("box107"));

		Thread.sleep(5000);

		// Drag And Drop the Element to match
		action.dragAndDrop(oslo, Norway).perform();
		action.dragAndDrop(Stockholm, Sweden).perform();
		action.dragAndDrop(Washington, UnitedStates).perform();
		action.dragAndDrop(Copenhagen, Denmark).perform();
		action.dragAndDrop(Seoul, SouthKorea).perform();
		action.dragAndDrop(Rome, Italy).perform();
		action.dragAndDrop(Madrid, Spain).perform();

		Thread.sleep(5000);

		driver.quit();
		;
	}

}

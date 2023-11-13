package SeleniumWebDriver.secondLesson;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;

public class SwithcingWindows {

	public static void main(String[] args) throws InterruptedException {
		//Selecting Browser
		String Browser = "Chrome"; // Write Desire Browser Name to Automate
		WebDriver driver = null;
						
		//Conditioning on Selecting Browser
		if(Browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Test Engineer\\Eclipse IDE\\Workspace\\SeleniumLibrary\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(Browser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver",   "C:\\Test Engineer\\Eclipse IDE\\Workspace\\SeleniumLibrary\\Drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		}else if(Browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver",   "C:\\Test Engineer\\Eclipse IDE\\Workspace\\SeleniumLibrary\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.get("http://omayo.blogspot.com/");
	//	driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.linkText("http://www.Selenium143.blogspot.com")).click(); //First Child window
		Thread.sleep(2000);
		driver.findElement(By.linkText("Blogger")).click();// Second child window
		
		
		Set<String> windowids = driver.getWindowHandles();
		Iterator<String> itr = windowids.iterator();
		
		String windowid = null;
		WebElement element1 = null;
		
		while(itr.hasNext()) {
			windowid = itr.next();
			driver.switchTo().window(windowid);
			if(driver.getTitle().equals("Selenium143")) {
				element1 = driver.findElement(By.linkText("What is Selenium?"));
				break;
			}
			
		}
		
		element1.click();
		
	
//		Set<String> windowids = driver.getWindowHandles();
//		Iterator<String> itr = windowids.iterator();
//		String mainWindow = itr.next();
//		String childWindow = itr.next();
//		
//	//	Change Focus to popup window
//		driver.switchTo().window(childWindow);
//		String title = driver.getTitle();
//		System.out.println(title);
//		
//		
		Thread.sleep(4000);
		driver.quit();
		
	}

}

package SeleniumWebDriver.firstLesson;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SeleniumAutomation1 {

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
		
	
		
		
		//ChromeDriver is a Predefined Class of Selenium WebDriver library
		//WebDriver is a Predefined interface of Selenium WebDriver library
		//ChromeDriver is the child Class of WebDriver Interface
		//ChromeDriver Class is for Chrome Browser
		//ChromeDriver() - Constructor - Launch Chrome Browser
		
		
		//Provided URL will be open in the Opened Chrome browser
		driver.get("http://omayo.blogspot.com");
		
		
		//Maximize and Full Screen the Browser
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		
		 
		 
		//Find Element "GetConfirmation" using ID
//			Thread.sleep(2000);
//			WebElement GetConfirmation = driver.findElement(By.id("confirm"));
//			GetConfirmation.click();
		 
		 
		 //Find Element Search This box
			Thread.sleep(2000);
			WebElement searchThisBox = driver.findElement(By.name("q"));
			searchThisBox.sendKeys("MIFTA CHOWDHURY");
		
		
		// Clear Text of prepopulated text box
			Thread.sleep(2000);
			WebElement ClearText = driver.findElement(By.id("textbox1"));
			ClearText.clear();
		
		
		// Get Text
		Thread.sleep(2000);
		WebElement gettext = driver.findElement(By.id("pah"));
		String printgettext = gettext.getText();
		System.out.println(printgettext);
		
		//Type Text in Box
		Thread.sleep(2000);
		driver.findElement(By.className("classone")).sendKeys("Check The Box");
		
		
		//Click a hyperlink
		Thread.sleep(2000);
		driver.findElement(By.linkText("compendiumdev")).click();
		Thread.sleep(2000);Thread.sleep(2000);
		driver.navigate().back();

		
		//getTitle and URL
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		 

		
		
		//getAttribute
		System.out.println("Attribute"+driver.findElement(By.id("textbox1")).getAttribute("value"));
		
		
		//is Enabled and is displayed
		System.out.println("isDisplayed: "+driver.findElement(By.id("but1")).isDisplayed());
		System.out.println("isEnabled: "+driver.findElement(By.id("but1")).isEnabled());
		
		
		//isSelected
		System.out.println("isSelected: "+driver.findElement(By.id("checkbox1")).isSelected());
		
		
		//navigate()
		Thread.sleep(2000);
		driver.navigate().to("https://www.google.com");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		//Get source code
//		String source = driver.getPageSource();
//		System.out.println(source);
		
		
		
		//Login for tutorial Ninja
//		driver.navigate().to("https://tutorialsninja.com/demo/index.php?route=account/login");
//		driver.findElement(By.id("input-email")).sendKeys("dr.tester@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("1234");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//body/div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]")).submit();		
		
		
		//Get cssValue
		System.out.println("CssValue of Home line-Height: "+driver.findElement(By.id("home")).getCssValue("line-height"));
		
		
		//Get size of a button
		Dimension d = driver.findElement(By.id("but2")).getSize();
		System.out.println("Height of the button is "+d.height);
		System.out.println("width of the button is "+d.width);
		
		
		// Get location of button
		Point l = driver.findElement(By.id("but2")).getLocation();
		System.out.println("Button Location x axis: "+l.x);
		System.out.println("Button Location y axis: "+l.y);

		
		
		
		//findElemntS() to get all link element
		List<WebElement> link = driver.findElements(By.tagName("a"));
		
		
		for (WebElement i:link) {
			if (i.getText().length()>0) {
				System.out.println(i.getText());
				}
			}	
		
		for ( int j = 0; j<link.size(); j++) {
			if(link.get(j).getText().length()>0) {
			System.out.println(link.get(j).getText());
			}
		}
		
		
		
		Thread.sleep(5000);
		driver.quit();
		//or
//		driver.close();
	}

}

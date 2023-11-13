package SeleniumWebDriver.fourthLesson;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class TakesScreenShot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


		//Take a screenshot
		File ss1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		FileHandler.copy(ss1, new File("./Screenshot/ss1.png"));
		//or FileUtils.copyFile(ss1, new File("Screenshot\\ss1.png"));

		
		//Click a second Link
		driver.findElement(By.linkText("onlytestingblog")).click();
		
		//Take a 2nd screen shots
		File ss2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(ss2, new File("./Screenshot/ss2.png"));
		//or FileUtils.copyFile(ss2, new File("Screenshot\\ss2.png"));

		
		//Click a Third Link
		driver.findElement(By.linkText("Home")).click();
		
		//Take a 3rd Screen Shots		
		File ss3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(ss3, new File("./Screenshot/ss3.png"));

		//Quit the browser
		driver.quit();
	}

	public static String captureScreenshot(WebDriver driver, String testName) {

		File srcScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destinationScreenshotPath = "./Screenshot/"+testName+".png";
		try {
			FileHandler.copy(srcScreenshot, new File (destinationScreenshotPath));
		} catch (IOException e) {

			e.printStackTrace();
		}
		return destinationScreenshotPath;

	}

}

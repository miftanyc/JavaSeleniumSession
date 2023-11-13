package SeleniumWebDriver.onlineExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class WindowHandlesProcedure {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        driver.get("https://omayo.blogspot.com/p/page7.html");

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://testautomationcentral.com/");

        Set<String> handles = driver.getWindowHandles();
        List<String> window = new ArrayList<String>(handles);

        for(int i=0; i<window.size(); i++){
            System.out.println(window.get(i));
        }

        driver.switchTo().window(window.get(0));
        driver.findElement(By.cssSelector("a.feed-link")).click();

    }
}

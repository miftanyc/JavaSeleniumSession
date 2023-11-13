package SeleniumWebDriver.fourthLesson;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTable {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(2000);
		
		//Print the Table Header
		List<WebElement> tableHeads = driver.findElements(By.xpath("//th"));
		System.out.println("Table Heads are: ");
		for(int i=0; i<tableHeads.size(); i++) {
			System.out.print(tableHeads.get(i).getText()+"   ");
		}System.out.println("\n");
		
		
		
		//Print the Table Body All Data
		List<WebElement> tbodyData = driver.findElements(By.xpath("//table[@id='table1'] //td"));
		System.out.println("Table Body Data are: ");
		for(int i=0;i<tbodyData.size();i++) {
			System.out.print(tbodyData.get(i).getText()+" ");
		}System.out.println("\n");
		
		
		
		//Get All the Name Column Data
		List<WebElement> nameColumn = driver.findElements(By.xpath("//table[@id='table1'] //td[1]"));
		System.out.println("Name in the first column are: ");
		for(int i=0;i<nameColumn.size();i++) {
			System.out.print(nameColumn.get(i).getText()+" "); 
		}System.out.println("\n");
		
		
		//Name of Colum using For Each Loop
		System.out.println("Name of Column using For-Each Loop: ");
		for(WebElement col: nameColumn) {
			System.out.print(col.getText()+" ");
		}System.out.println("\n");
		
		
		//Get All the Age Column Data
		List<WebElement> ageData = driver.findElements(By.xpath("//table[@id='table1'] //td[2]"));
		System.out.println("Age in the second column are: ");
		for(int i=0;i<ageData.size();i++) {
			System.out.print(ageData.get(i).getText()+" ");
		}System.out.println("\n");
		
		
		
		//Get All the Place Column Data
		List<WebElement> placeData = driver.findElements(By.xpath("//table[@id='table1'] //td[3]"));
		System.out.println("Place in the third column are: ");
		for(int i=0;i<placeData.size();i++) {
			System.out.print(placeData.get(i).getText()+" ");
		}System.out.println("\n");
		
		
		//Find the Place of Praveen in row 3
		String givenname = "Praveen";
		int row = 0;
		List<WebElement> names = driver.findElements(By.xpath("//table[@id='table1'] //td[1]"));
		for(int i=0;i<names.size();i++) {
			if(names.get(i).getText().contains(givenname)) {
				row = i+1;
				break;
			}	
		}
		String targetplace = "//table[@id='table1']//tr["+row+"]/td[3]";
		String targetPlaceName = driver.findElement(By.xpath(targetplace)).getText();
		System.out.println("Living Place for "+givenname+": "+targetPlaceName);
		
		 
		//Finding Number of Row
		List<WebElement> tablerow = driver.findElements(By.xpath("//table[@id='table1']//tr"));
		System.out.println("Number of rows in this table: "+ (tablerow.size()-1));
		
		
		//Finding Number of Column
		List<WebElement> tablecolumn = driver.findElements(By.xpath("//table[@id='table1']//th"));
		System.out.println("Number of Column is this table: "+tablecolumn.size());
		
		
		Thread.sleep(5000);
		driver.quit();
	}

}
 
package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDropdown {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.driver.chromedriver", "./drivers/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--incognito");
		
		ChromeDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/droppable.php");
		
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
		try {
			Actions act = new Actions(driver);
			act.dragAndDrop(source, target).perform();
		} catch (Exception e) {
			System.out.println("Operation is not performed");
		}
		
		
	}

}

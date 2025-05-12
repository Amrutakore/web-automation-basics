package dropdownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DselectByValue {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chromedriver", "./drivers/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--incognito");
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(By.xpath("//a[text()=' Select Menu']"));
		
		WebElement ele =driver.findElement(By.xpath("//select[@id='demo-multiple-select']"));
		
		Select sel=new Select(ele);
		if (sel.isMultiple()) {
            sel.selectByVisibleText("Home, Garden & Tools");
            sel.selectByVisibleText("Books");

            Thread.sleep(2000); 

            sel.deselectByVisibleText("Books");
        } else {
            System.out.println("Not a multi-select dropdown");
        }
		
        driver.quit();
	}
}

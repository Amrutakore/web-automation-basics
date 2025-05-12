package JavascriptExecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScrollDownOperation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chromedriver", "./drivers/chromedriver.exe");
		
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--incognito");
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		
		driver.findElement(By.xpath("//button[text()=' Widgets']")).click();
		Thread.sleep(2000);
		
		//WebElement wel= driver.findElement(By.xpath("//a[text()=' Scoll Top']"));
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1200)", " ");
		
//		WebElement wel= driver.findElement(By.xpath("//a[text()=' Scoll Down']"));
//		wel.click();
//		
//		Thread.sleep(2000);
//		
//		js.executeScript("window.scrollBy(0,500)", "");
		driver.quit();

	}

}

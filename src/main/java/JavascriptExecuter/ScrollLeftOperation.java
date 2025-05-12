package JavascriptExecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScrollLeftOperation {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.driver.chromedriver", "./drivers/chromedriver.exe");
		
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--incognito");
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");

		driver.findElement(By.xpath("//button[text()=' Widgets']")).click();
		Thread.sleep(2000);
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1200)", " ");
		System.out.println("After clicking on widgets, window scrolled down");
		
		WebElement wel= driver.findElement(By.xpath("//a[text()=' Horizontal Scroll']"));
		Thread.sleep(2000);
		wel.click();
		
		js.executeScript("window.scrollBy(0,1200)", " ");
		Thread.sleep(2000);
		System.out.println("After clicking on Horizantal scroll, window scrolled down");
		
		WebElement scrollDiv = driver.findElement(By.xpath("//div[@class='horizan-scroll']"));
		js.executeScript("window.scrollBy(-900,0)", scrollDiv);
		
		System.out.println("Scrolled horizontally inside the div");
		Thread.sleep(2000);
		driver.quit();
		
	}

}

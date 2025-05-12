package popupHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chromedriver", "./drivers/chromedriver.exe");
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--Incognito");
		ChromeDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,750)", " ");
		
		driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']")).click();
		driver.findElement(By.xpath("//span[text()='Modal Dialogs']")).click();

		js.executeScript("window.scrollBy(0,550)", " ");
		
		driver.findElement(By.xpath("//button[text()='Small modal']")).click();
		Thread.sleep(2000);
		options.addArguments("--disable-notifications");
		driver.quit();
	}

}

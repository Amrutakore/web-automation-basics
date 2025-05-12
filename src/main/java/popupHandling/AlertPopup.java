package popupHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertPopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chromedriver", "./drivers/chromedriver.exe");
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--Incognito");
		ChromeDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		driver.findElement(By.xpath("//button[text()=' Alerts, Frames & Windows ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=' Alerts']")).click();
		driver.findElement(By.xpath("//button[text()='Alert']")).click();
		Thread.sleep(2000);
		Alert al=driver.switchTo().alert();
		String textpopup= al.getText();
		System.out.println("Text on popup: "+textpopup);
		al.accept();
		System.out.println("Popup Handled Sucessfully");
		driver.quit();
	}

}

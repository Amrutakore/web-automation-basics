package popupHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPopupWithConfirmButton {

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
		
		driver.findElement(By.xpath("(//button[text()='Click Me'])[2]")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert alert=driver.switchTo().alert();
		String textonPopup=alert.getText();
		System.out.println("Text on popup is: "+textonPopup);
		Thread.sleep(500);
		alert.dismiss();
		
		System.out.println("Popup closed sucessfully!");
		driver.quit();
	}

}

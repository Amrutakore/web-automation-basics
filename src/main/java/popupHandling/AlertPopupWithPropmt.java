package popupHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPopupWithPropmt {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chromedriver", "./drivers/chromedriver.exe");
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--Incognito");
		ChromeDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alertsWindows");
		//driver.findElement(By.xpath("//button[text()=' Alerts, Frames & Windows ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Alerts']")).click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)", "");
		
		driver.findElement(By.xpath("(//button[text()='Click me'])[4]")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert alert=driver.switchTo().alert();
		System.out.println("Text on popup is: " + alert.getText());
        Thread.sleep(500);

		alert.sendKeys("Amrit");
		Thread.sleep(2000);
		alert.accept();
		
		try {
			WebElement result=driver.findElement(By.xpath("//span[@id='promptResult']"));
			
			if(result.isDisplayed()) {
				System.out.println("Your entered Text is: " + result.getText());
			}else {
				System.out.println("Text is not eneterd");
			}
		} catch (Exception e) {
			System.out.println("Error while fetching result: " + e.getMessage());
		}
		
		System.out.println("Popup closed sucessfully!");
		driver.quit();
	}

}

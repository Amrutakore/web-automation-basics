package methodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetMethod {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--incognito");
		ChromeDriver driver=new ChromeDriver(options); //to launch chromebrowser
		driver.manage().window().maximize();  //to maximize the window
		driver.get("https://www.google.com"); //to open the URL
		Thread.sleep(2000);
		try {
			WebElement staySignedOutBtn=driver.findElement(By.xpath("//button[text()='Stay signed out']"));
			staySignedOutBtn.click();
		} catch (Exception e) {
			System.out.println("Stay signed out button is not found");
		}
		
		
	}
}

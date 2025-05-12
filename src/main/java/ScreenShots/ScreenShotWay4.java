package ScreenShots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.support.events.EventFiringWebDriver;
import com.google.common.io.Files;

public class ScreenShotWay4 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.driver.chromedriver", ".drivers/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--incognito");
		co.addArguments("--start-maximized");
		
		
		RemoteWebDriver driver=new ChromeDriver(co);
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bluestone.com/");
		
		// way 4 create the obj of EventFiringWebDriver (C)
		
       // EventFiringWebDriver evf = new EventFiringWebDriver(driver);
        Thread.sleep(5000);
        File src = driver.getScreenshotAs(OutputType.FILE);
        File dest = new File("./Screenshots/SSWay4.png");
        
        Files.copy(src, dest);
        driver.quit();
	}

}

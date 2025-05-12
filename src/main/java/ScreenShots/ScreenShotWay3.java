package ScreenShots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ScreenShotWay3 {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.driver.chromedriver", ".drivers/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--incognito");
		co.addArguments("--start-maximized");
		
		// way 3 upcast the browser specific classes into RemoteWebDriver (class)
		RemoteWebDriver driver=new ChromeDriver(co);
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bluestone.com/");
        Thread.sleep(2000);
        File src = driver.getScreenshotAs(OutputType.FILE);
        File dest = new File("./Screenshots/SSWay3.png");
        
        Files.copy(src, dest);
        driver.quit();
	}

}

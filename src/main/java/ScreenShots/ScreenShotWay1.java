package ScreenShots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class ScreenShotWay1 {
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.driver.chromedriver", ".drivers/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--incognito");
		co.addArguments("--start-maximized");
		ChromeDriver driver=new ChromeDriver(co);
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bluestone.com/");
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/ssWay1.jpg");
		
		Files.copy(src, dest);
	}

}

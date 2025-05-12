package methodsOfWebElement;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SwitchToMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chromeDriver", "./drivers/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--incognito");
		
		ChromeDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("Java Programming" + Keys.ENTER);
		System.out.println("Switched to activeElement");
		driver.close();
	}

}

package methodsOfWebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetTitleMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chromeDriver", "./drivers/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--incognito");
		
		ChromeDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		String title=driver.getTitle();
		System.out.println(title);

	}

}

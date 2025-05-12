package MethodsOfWebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CloseMethod {
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");)
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--incognito");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.selenium.dev/downloads/");
		driver.close();
		System.out.println("Your chrome window get closed");
	}

}

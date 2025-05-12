package methodsOfWebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CloseMethod {
	public static void main(String[] args) {
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--incognito");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.selenium.dev/downloads/");
		driver.close();
		System.out.println("Your chrome window gwt closed");
	}

}

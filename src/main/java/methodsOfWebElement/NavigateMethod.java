package methodsOfWebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

        // ✅ Correct property name and path
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe"); // This is line added forSessionNotCreatedException Chrome and chromedriver version is not same

        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        driver.get("https://www.google.com/");
        System.out.println("Google is opened");

        Thread.sleep(2000); // increased wait time to 2 sec for better visibility

        driver.navigate().to("https://www.wikipedia.org/");
        System.out.println("Wikipedia is opened");
        Thread.sleep(2000);
        driver.navigate().back();
        System.out.println("Google is opened again");
        Thread.sleep(2000);
        driver.navigate().forward();
        System.out.println("Wikipedia is opened again");
        Thread.sleep(2000);
        driver.quit(); //to close browser at the end
	}

}

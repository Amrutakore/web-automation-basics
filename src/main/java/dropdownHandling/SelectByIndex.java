package dropdownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndex {
	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--incognito");

        ChromeDriver driver = new ChromeDriver(co);
        driver.manage().window().maximize();
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");

        driver.findElement(By.xpath("//button[text()=' Widgets']")).click();
        Thread.sleep(2000);

        WebElement selectMenu = driver.findElement(By.xpath("//a[text()=' Select Menu']"));
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,550)", "");
        Thread.sleep(2000);
        //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", selectMenu);
        selectMenu.click();
        Thread.sleep(2000);

        // Scroll to dropdown and click to open
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='inputGroupSelect03']"));
        Select sel=new Select(dropdown);
        
        sel.selectByIndex(3);
        Thread.sleep(1000);

        // Click the desired option
        WebElement option = driver.findElement(By.xpath("//option[text()='Mrs.']"));
        option.click();
        
       String val= option.getAttribute("value");
        
        System.out.println(val);

        Thread.sleep(2000);
        driver.quit();
	}
}

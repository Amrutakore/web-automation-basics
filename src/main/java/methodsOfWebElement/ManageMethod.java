package methodsOfWebElement;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ManageMethod {
public static void main(String[] args) {
	System.setProperty("webdriver.driver.chromedriver", "./drivers/chromedriver.exe");
	ChromeOptions co=new ChromeOptions();
	co.addArguments("--incognito");
	
	ChromeDriver driver=new ChromeDriver(co);
	driver.manage().window().maximize(); //to maximize the window
	System.out.println("Cookies: " + driver.manage().getCookies());
	
	Dimension targetSize= new Dimension(475,290);
	driver.manage().window().setSize(targetSize);
	
	Point targetPosition =new Point(350,250);
	driver.manage().window().setPosition(targetPosition);
	
	driver.close();
	
	}
}

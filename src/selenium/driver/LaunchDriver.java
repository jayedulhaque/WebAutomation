package selenium.driver;


import org.openqa.selenium.By;
import page.object.model.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class LaunchDriver {
	WebDriver driver = new ChromeDriver();
	public WebDriver getDriver()
	{
		return driver;
	}
}

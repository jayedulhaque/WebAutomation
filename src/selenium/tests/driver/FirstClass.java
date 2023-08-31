package selenium.tests.driver;

import org.openqa.selenium.By;
import page.object.model.*;
import selenium.driver.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.AWTException;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.monte.media.math.Rational;
import org.monte.media.Format;
import org.monte.screenrecorder.ScreenRecorder;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import static org.monte.media.AudioFormatKeys.*;
import static org.monte.media.VideoFormatKeys.*;

public class FirstClass {
	private static ScreenRecorder screenRecorder;
	public static void main(String[] args) throws IOException, AWTException{
		GraphicsConfiguration gconfig = GraphicsEnvironment
		         .getLocalGraphicsEnvironment()
		         .getDefaultScreenDevice()
		         .getDefaultConfiguration();
		      
		      screenRecorder = new ScreenRecorder(gconfig,
		         new Format(MediaTypeKey, MediaType.FILE, MimeTypeKey, MIME_AVI),
		         new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey,
		            ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
		            CompressorNameKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
		            DepthKey, (int)24, FrameRateKey, Rational.valueOf(15),
		            QualityKey, 1.0f,
		            KeyFrameIntervalKey, (int) (15 * 60)),
		         new Format(MediaTypeKey, MediaType.VIDEO,
		            EncodingKey,"black", FrameRateKey, Rational.valueOf(30)), null);
		// System.setProperty("webdriver.gecko.driver","C://Users//user//eclipse//geckodriver-v0.33.0-win-aarch64//geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C://Users//user//eclipse//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		// Start Capturing the Video
	      //screenRecorder.start();
		driver.get("http://159.89.38.11/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//DashboardPage dBoard= new DashboardPage(driver);
		LoginPage login = new LoginPage(driver);
		
		// Enter username & password
		login.enterUsername("test@orangetoolz.com");
		login.enterPassword("8Kh8nTe*^jdk");

		// Click on login button
		login.clickLogin();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.className("dt-side-nav"));		
		action.moveToElement(ele).build().perform();
		WebElement automate= driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/main[1]/aside[1]/div[1]/ul[1]/li[4]/a[1]"));
		automate.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement ele1 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/a[1]"));
		ele1.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Contact contact = new Contact(driver);
		contact.enterNumber("623498230948834983");
		contact.enterEmail("gfg@gmail.com");
		contact.enterFname("123456");
		contact.enterLname("123456");
		contact.enterBirthday("123456");
		contact.enterCity("123456");
		contact.enterState("123456");
		contact.enterZip("123456");
		contact.enterCountry("123456");
		contact.enterAddress("123456");
		contact.addClick();
		driver.close();
		//screenRecorder.stop();
	}

}

package page.object.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Contact {
	WebDriver driver;

	public Contact(WebDriver driver) {
		this.driver = driver;
	}
	By number = By.name("number");
	By fName = By.name("first_name");
	By lName = By.name("last_name");
	By email = By.name("email");
	By bDate = By.name("birthday");
	By city = By.name("city");
	By state = By.name("state");
	By zip = By.name("zip");
	By country = By.name("country");
	By address = By.name("address");
	By addBtn = By.xpath("(//button[normalize-space()='Add Contact'])[1]");
	public void enterNumber(String user) {
		driver.findElement(number).sendKeys(user);
	}
	public void enterEmail(String user) {
		driver.findElement(email).sendKeys(user);
	}
	public void enterFname(String user) {
		driver.findElement(fName).sendKeys(user);
	}
	public void enterLname(String user) {
		driver.findElement(lName).sendKeys(user);
	}
	public void enterBirthday(String user) {
		driver.findElement(bDate).sendKeys(user);
	}
	public void enterCity(String user) {
		driver.findElement(city).sendKeys(user);
	}
	public void enterState(String user) {
		driver.findElement(state).sendKeys(user);
	}
	public void enterZip(String user) {
		driver.findElement(zip).sendKeys(user);
	}
	public void enterCountry(String user) {
		driver.findElement(country).sendKeys(user);
	}
	public void enterAddress(String user) {
		driver.findElement(address).sendKeys(user);
	}
	public void addClick() {
		driver.findElement(addBtn).click();
	}
}

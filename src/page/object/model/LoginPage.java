package page.object.model;

import org.openqa.selenium.*;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	// Locator for username field
	By uName = By.id("email-1");
	// Locator for password field
	By pswd = By.id("password-1");
	// Locator for login button
	By LoginBtn = By.id("m_login_signin_submit");
	// Method to enter username
	public void enterUsername(String user) {
		driver.findElement(uName).sendKeys(user);
	}
	// Method to enter password
	public void enterPassword(String pass) {
		driver.findElement(pswd).sendKeys(pass);
	}
	// Method to click login button
	public void clickLogin() {
		driver.findElement(LoginBtn).click();
	}
}

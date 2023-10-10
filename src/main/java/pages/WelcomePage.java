package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	WebDriver driver;
	public WelcomePage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean verifySuccessfulLogin(String loginMessage) {
		return driver.getPageSource().toLowerCase().contains(loginMessage.toLowerCase());
    }
	
	public boolean verifyUnSuccessfulLogin(String loginMessage) {
		return driver.getPageSource().toLowerCase().contains(loginMessage.toLowerCase());
   }
	

}

package pages;

import org.openqa.selenium.WebDriver;


public class BasePage{
	WebDriver driver;
	public BasePage(WebDriver driver) {
		this.driver = driver;		
	}
			
	public void goToHomePage() {
		driver.navigate().to(library.Constant.URL);	
	}
	
	public String verifyHomePage() {
		return driver.getTitle();
	}

}

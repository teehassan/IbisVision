package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}	
		
	@FindBy(id ="login_username")
	WebElement username;
	
	@FindBy(xpath = "//input[@id ='login_password']")
	WebElement password;
	
	
	By clickButton = By.xpath("//button[@id='login-btn']");
	
	public void enterLoginDetails(String user, String pass) {
		username.sendKeys(user);
		password.sendKeys(pass);	
		
	}
	
	public void goToDashboardPage() {
		driver.findElement(clickButton).click();		
	}
		
}
	
	

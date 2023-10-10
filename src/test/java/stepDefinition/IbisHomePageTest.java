package stepDefinition;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasePage;
import pages.HomePage;
import pages.WelcomePage;
import utility.BaseUtil;

public class IbisHomePageTest extends BaseUtil{
	
	String ActualTitle = "IBIS-Connect";
	
	private BaseUtil base;
	public IbisHomePageTest(BaseUtil base) {
		this.base = base;
	}

	@Given("user is on the home page")
	public void user_is_on_the_home_page() {
		BasePage basepage = new BasePage(base.driver);
		basepage.goToHomePage();
	}

	@And("login page is visible")
	public void login_page_is_visible() {
		BasePage basepage = new BasePage(base.driver);		
		assertEquals(basepage.verifyHomePage(), ActualTitle);
	}
		

	@When("user enters a valid username and password")
	public void user_enters_a_valid_username_and_password() {
		HomePage homepage = new HomePage(base.driver);
		homepage.enterLoginDetails("test_ibisvision", "ibisvision123!");
	}

	@And("user clicks on login")
	public void user_clicks_on_login() {
		HomePage homepage = new HomePage(base.driver);
		homepage.goToDashboardPage();
	}

	@Then("user should be logged in successfully")
	public void user_should_be_logged_in_successfully() {
		WelcomePage welcomepage = new WelcomePage(base.driver);
		assertTrue(welcomepage.verifySuccessfulLogin("Dashboard"));
	}

	@When("user enters an invalid username and password")
	public void user_enters_an_invalid_username_and_password() {
		HomePage homepage = new HomePage(base.driver);
		homepage.enterLoginDetails("test_ibis", "password");	   
	}

	@Then("user should see an error messsage displayed")
	public void user_should_see_an_error_messsage_displayed() {
		WelcomePage welcomepage = new WelcomePage(base.driver);
		assertTrue(welcomepage.verifyUnSuccessfulLogin("Invalid credentials!"));
	}
}



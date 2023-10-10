package stepDefinition;

import java.time.Duration;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utility.BaseUtil;

public class Hooks extends BaseUtil{
	private BaseUtil base;
	public Hooks(BaseUtil base) {
		this.base = base;
	}
	
	@Before
	public void setUp() {
		base.driver = library.Browser.Selector("firefox");
		base.driver.manage().window().maximize();
		base.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@After
    public void tearDown() {
		if(base.driver != null) {
			base.driver.quit();
		}		
	}

}

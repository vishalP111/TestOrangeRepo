package Steps;

import org.junit.Assert;
import org.openqa.selenium.By;

import BaseLayer.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomePageStepsTest extends BaseClass {
	
	@Given("User is on home page and capture logo")
	public void user_is_on_home_page_and_capture_logo() {
	   boolean logo= driver.findElement(By.xpath("//img[@src='/web/images/orangehrm-logo.png?v=1711595107870']")).isDisplayed();
	   Assert.assertEquals(logo, true);
	    
	}
	@When("User capture the Title")
	public void user_capture_the_title() {
	String Title=	driver.getTitle();
	Assert.assertEquals(Title, "OrangeHRM");
	   
	}

}

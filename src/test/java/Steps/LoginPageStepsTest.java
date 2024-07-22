package Steps;

import org.openqa.selenium.By;

import BaseLayer.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepsTest extends BaseClass  {


@Given("User is on login page")
public void user_is_on_login_page() {
    BaseClass.initialization();
}

@When("User enter username and password")
public void user_enter_username_and_password() {
   driver.findElement(By.name("username")).sendKeys("Admin");
   driver.findElement(By.name("password")).sendKeys("admin123");
}

@Then("User click on login button")
public void user_click_on_login_button() {
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
}
}

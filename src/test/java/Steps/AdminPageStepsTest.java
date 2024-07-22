package Steps;

import org.openqa.selenium.By;

import BaseLayer.BaseClass;
import io.cucumber.java.en.When;

public class AdminPageStepsTest extends BaseClass{
	@When("User is on admin page and click")
	public void user_is_on_admin_page_and_click() {
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
	   
	}

}

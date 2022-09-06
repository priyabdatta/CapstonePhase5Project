package stepdefs;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserSteps {
	
	
	WebDriver driver = setUp.driver;
	UserPage objUser = new UserPage();
	
	
	@When("User click on the Continue Shopping Button")
	public void user_click_on_the_continue_shopping_button() throws Throwable {
		
		objUser.ContinueShop();
		Thread.sleep(1000);
	   
	}

	@Then("User sees the All Product page")
	public void user_sees_the_all_product_page() {
		
		String ExpPage = "All Products";
		String ActualPage = objUser.Allproducts();
		Assert.assertEquals(ExpPage, ActualPage);
		
	    
	}

}

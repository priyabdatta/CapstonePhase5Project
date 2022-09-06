package stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {
	
WebDriver driver = setUp.driver;
	
	@FindBy(xpath = "//*[@href='/medicare/show/all/products']")
	WebElement ContinueShoping;
	
	@FindBy(xpath = "//*[@class='breadcrumb']/li[2]")
	WebElement AllProducts;
	
	 public UserPage () {
			
			PageFactory.initElements(driver, this);
		}
	 
	 public void ContinueShop() {
		 
		 ContinueShoping.click();
	 }
	 
	 public String Allproducts() {
		 
		 return AllProducts.getText();
	 }

}



package stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {
	
	
WebDriver driver = setUp.driver;
	
	@FindBy(id = "dropdownMenu1")
	WebElement User;
	
	@FindBy(xpath = "//*[@id=\"logout\"]/a")
	WebElement LogOut;
	
	@FindBy(xpath = "//*[@class='panel-heading']")
	WebElement LogoutConfirmation;
	
 public AdminPage () {
			
			PageFactory.initElements(driver, this);
		}
	 
	 
public void User() {
	
	User.click();
}

public void LogOut() {
	
	LogOut.click();
}

public String Confirmation() {
	
	return LogoutConfirmation.getText();
}
}


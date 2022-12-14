package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class login_page {
	
	@FindBy(id = "email")
	public static WebElement Username;
	@FindBy(id = "password")
	public static WebElement Password;
	@FindBy (id ="mui-1")
	public static WebElement LoginButton;
}

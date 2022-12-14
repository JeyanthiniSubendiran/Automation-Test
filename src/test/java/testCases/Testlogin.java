package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import driverInitilization.DriverBase;
import page.ElementTH;

public class Testlogin extends DriverBase {
	
	ElementTH loginvr = new ElementTH();
	
	@Test
	public void loginTH()
	{
		PageFactory.initElements(driver,loginvr);
		loginvr.username.sendKeys("admin@gmail.com");
		loginvr.password.sendKeys("admin");
		loginvr.loginbutton.click();
	}

}

package driverInitilization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DriverBase {
	
	public static WebDriver driver;
	public static String URL = "http:/transport-hub-qa-release.com.s3-website.ap-south-1.amazonaws.com/";
	
	@Test
	@BeforeMethod
	public void main()
	{
		System.setProperty("WebDriver.gecko.driver", "C:\\Browser Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(URL);
	}

}

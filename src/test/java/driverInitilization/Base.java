package driverInitilization;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class Base{
	
	public static WebDriver driver;
	
	@BeforeMethod
	public  void main()  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Browser Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http:/transport-hub-qa-release.com.s3-website.ap-south-1.amazonaws.com/");
		//Thread.sleep(5000);
		//driver.findElement(By.id("email"));
		//driver.findElement(By.id(""));

	}

}

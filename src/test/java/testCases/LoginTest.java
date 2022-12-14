package testCases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import driverInitilization.Base;
import page.login_page;

public class LoginTest extends Base{
	
	
	 login_page loginpg = new login_page();
	 
	@Test
	public void Login() {
		PageFactory.initElements(driver, loginpg);
		login_page.Username.sendKeys("1111111");
		login_page.Password.sendKeys("22222");
		
		
//		  FileInputStream file = new FileInputStream("C:\\eclipse-work space\\SGICAutomation\\src\\test\\java\\excel\\Testcases.XLSX");
//	        XSSFWorkbook workbook = new XSSFWorkbook(file);
//	        XSSFSheet sheet = workbook.getSheet("Sheet1");
//	        
//	        int rowcount = sheet.getLastRowNum();
//	        
//	        for(int i=0; i<=rowcount;i++) 
//	        {        
//	        	XSSFRow row = sheet.getRow(i);     
//	        
//	                String uName = (String)row.getCell(0).getStringCellValue();
//	                String pWord = (String)row.getCell(1).getStringCellValue();
	                //String expect = (String)row.getCell(2).getStringCellValue();
//	                
	                //if(driver.getCurrentUrl().contains(URL)) {
	                //login_page.Username.clear();
//	                login_page.Username.sendKeys(uName);
//	                login_page.Password.clear();
//	                login_page.Password.sendKeys(pWord);
//	                login_page.LoginButton.click();
//	                 Thread.sleep(2500);
	         }
//	                else {
//	                    closeChrome();
	        
		//loginpg.Username.sendKeys("admin@gmail.com");
		//loginpg.Password.sendKeys("admin");
		//loginpg.LoginButton.click();
		
		
		
	}

	
//}

package sampleNG;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstTest {
	WebDriver driver;
	public String baseurl="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
	@BeforeTest
	public void setBaseUrl()
	{
	
		System.setProperty("webdriver.chrome.driver","E:\\seleniumWorkSpace\\webdriverBasics\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseurl);
		System.out.println("Hellooo ....");
	}
	@Test
	public void verifyHomePageTitle()
	{
		String exceptedHomePAge="OrangeHRM";
		String acualTitle="OrangeHRM";
		Assert.assertEquals(acualTitle, exceptedHomePAge);
	}
	@AfterTest
    public void endSession() 
	{
		driver.quit();
		
	}

}

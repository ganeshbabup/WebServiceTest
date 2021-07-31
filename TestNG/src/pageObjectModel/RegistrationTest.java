package pageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest {
	
	@Test
	public void verifyFlightReg() {
		System.setProperty("webdriver.chrome.driver","E:\\seleniumWorkSpace\\webdriverBasics\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/index.php");
		RegistrationPage RGpage=new RegistrationPage(driver);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)	;
		RGpage.clickRegLink();
		RGpage.setFirstName("Raji");
		RGpage.setLastName("S");
		RGpage.setPhoneNO("7997012141");
		RGpage.setEmail("rajeswari4a1@gmail.com");
		RGpage.setAdress("Kukutpally");
		RGpage.setCity("Hyderabad");
		RGpage.setState("Telangana");
		RGpage.setPostalCode("500090");
		RGpage.setCountry("India");
		RGpage.setUserName("RajiS");
		RGpage.setPassword("rajis123");
		RGpage.setConfrm("rajis123");
		RGpage.setSubmit();
		System.out.println("updated successfully");
		System.out.println("Git commit updated");
		System.out.println("Git ChildBranch updated");
		//validation
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(),"Register: Mercury Tours" );
		
		
		
		}

}

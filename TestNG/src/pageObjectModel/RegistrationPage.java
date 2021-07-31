package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {
	WebDriver driver;

	@FindBy(how = How.LINK_TEXT, using = "REGISTER")
	WebElement Reglink;

	@FindBy(name = "firstName")
	WebElement FirstName;

	@FindBy(name = "lastName")
	WebElement LastName;

	@FindBy(name = "phone")
	WebElement Phone;

	@FindBy(name = "userName")
	WebElement Email;

	@FindBy(name = "address1")
	WebElement Address;

	@FindBy(name = "city")
	WebElement City;

	@FindBy(name = "state")
	WebElement State;

	@FindBy(name = "postalCode")
	WebElement PostalCode;

	@FindBy(name = "country")
	WebElement Country;

	@FindBy(name = "email")
	WebElement UserName;

	@FindBy(name = "password")
	WebElement Password;

	@FindBy(name = "confirmPassword")
	WebElement ConfirmPassword;

	@FindBy(name = "submit")
	WebElement Submit;

	public RegistrationPage(WebDriver d) {
		driver = d;
		PageFactory.initElements(d, this);

	}

	public void clickRegLink() {
		Reglink.click();
	}

	public void setFirstName(String fname) {
		FirstName.sendKeys(fname);
	}

	public void setLastName(String lname) {
		LastName.sendKeys(lname);
	}

	public void setPhoneNO(String no) {
		Phone.sendKeys(no);
	}

	public void setEmail(String email) {
		Email.sendKeys(email);
	}

	public void setAdress(String addr) {
		Address.sendKeys(addr);
	}

	public void setCity(String city) {
		City.sendKeys(city);
	}

	public void setState(String state) {
		State.sendKeys(state);
	}

	public void setPostalCode(String postal) {
		PostalCode.sendKeys(postal);
	}

	public void setCountry(String country) {
		Country.sendKeys(country);
	}

	public void setUserName(String usrename) {
		UserName.sendKeys(usrename);
	}

	public void setPassword(String pswd) {
		Password.sendKeys(pswd);
	}

	public void setConfrm(String cfrmPswd) {
		ConfirmPassword.sendKeys(cfrmPswd);
	}

	public void setSubmit() {
		Submit.click();
	}
	
	public void setClick() {
		Submit.click();
	}

}

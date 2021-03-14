package pomproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Test {

	WebDriver driver;

	public Test (){
		this.driver=driver;
		//PageFactory.initElements(driver, Test .class);
	}



	@FindBy(id="email")
	WebElement email; 
	@FindBy(id="pass")
	WebElement password;
	@FindBy(id="loginbutton")
	WebElement log;


	public WebElement email() {
		return email;
	}

	public WebElement pass() {
		return password;
	}
	public WebElement login() {
		return log;
	}
}
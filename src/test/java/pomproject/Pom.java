package pomproject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class Pom {

	WebDriver driver;

	@Test

	public void abc() throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/hasanath/Downloads/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(-5000);
		
		
	
		



	}

}

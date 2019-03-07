package qaclickacademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumTest {
	public WebDriver driver = null;

	@Test
	public void Login() {
		System.out.println("Welcome to Selenium Login Page :");
	}

	@Test
	public void Logout() {
		System.out.println("Welcome to Selenium Logout Page :");
	}

	@Test
	public void pageTitle() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Gaurav\\work\\chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(5000L);
		driver.get("http://www.google.com");
		
		System.out.println("Page Title :" + driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
	}

}

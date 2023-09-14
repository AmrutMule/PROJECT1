package project_test;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import project_pom.Login_pom;

public class Login_test {
WebDriver driver ;
Login_pom login;


	@BeforeClass
	public void beforeclass() {
		
	
    System.setProperty("webdriver.chrome.driver","C:\\Users\\AMRUT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	
    driver = new ChromeDriver();
    driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("http://localhost:9090/user/showLogin");
	
	login = new Login_pom(driver);
	System.out.println("Setup Done");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("Testing Started");
		login.gmail();
	}
	
	@Test
	public void test() {
		
		login.pass();
		System.out.println("Tested Login Page");
		login.login();
		System.out.println("Login Successful");
	}
}

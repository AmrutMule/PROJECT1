package project_test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import project_pom.Login_pom;
import project_pom.Shipment_reg_pom;

public class Shipment_reg_test {

	WebDriver driver;
	Shipment_reg_pom reg;
	Login_pom login;
	@BeforeClass
	public void beforeclass() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AMRUT\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://localhost:9090/user/showLogin");
		login = new Login_pom(driver);
		login.gmail();
		login.pass();
		login.login();
	}
	@Test
	public void test() {
		reg = new Shipment_reg_pom(driver);
		reg.shipment();
		reg.register();
		reg.shipmode();
		reg.air();
		reg.shipcode();
	}
	@Test
	public void test1() {
		reg.enableship();
		reg.shipgrade();
		reg.description();
		reg.submit();
	}
}

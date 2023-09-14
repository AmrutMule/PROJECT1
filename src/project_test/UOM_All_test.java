package project_test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import project_pom.Login_pom;
import project_pom.UOM_All_pom;

public class UOM_All_test {
	WebDriver driver;
	UOM_All_pom log;
	Login_pom in;
	@BeforeClass
	public void before() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AMRUT\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
		  driver = new ChromeDriver();
		    driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("http://localhost:9090/user/showLogin");
		in = new Login_pom(driver);
		in.gmail();
		in.pass();
		in.login();
	}
	@Test
	public void test() throws Exception {
		log = new UOM_All_pom(driver);
		log.uom();
		Thread.sleep(2000);
		log.all();
		log.delete();
		log.edit();
		
		
		log.uomtype();
		log.submit();
	}

}

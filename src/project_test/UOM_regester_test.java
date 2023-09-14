package project_test;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import project_pom.UOM_register_Pom;
public class UOM_regester_test {
WebDriver driver;
UOM_register_Pom reg;

@BeforeClass
public void BeforeClass() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\AMRUT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	driver.get("http://localhost:9090/user/showLogin");
	reg = new UOM_register_Pom(driver);
}
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("SetUp Ready");
		
		
	}
		
		@Test
		public void Test1() {
			reg.gmail();
			reg.pass();
			reg.login();
			System.out.println("Login Done");
			
		}	
			@Test
			public void Test2() {
				reg.uom();
				reg.regester();
				reg.uomtype();
				reg.packing();
				reg.uomodel();
				reg.description();
				reg.submit();
				System.out.println("Registration Done");
				
			}
			@AfterClass
			public void AfterClass() {
				driver.close();
				

}
}



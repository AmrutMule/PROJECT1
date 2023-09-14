package utill;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utility {

	
	public static  void login() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AMRUT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
	  WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://localhost:9090/user/showLogin");
	}
}

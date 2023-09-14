package project_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_pom {

	
	@FindBy(xpath = "//input[@id='username']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath = "//input[@value='Login']")
	private WebElement login;
	
	
	public Login_pom(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void gmail() {
		username.sendKeys("irise.com");
	}
	public void pass() {
		password.sendKeys("1234");
	}
	public void login() {
		login.click();
	}
}

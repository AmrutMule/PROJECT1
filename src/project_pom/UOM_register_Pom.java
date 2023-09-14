package project_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UOM_register_Pom {

	
	
	@FindBy(xpath = "//input[@id='username']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath = "//input[@value='Login']")
	private WebElement login;
	
	@FindBy(xpath = "(//a[@role='button'])[1]")
	private WebElement uom;
	
	@FindBy(xpath = "//div[@class='dropdown-menu show']//a[1]")
	private WebElement register;
	
	@FindBy(xpath = "//select[@id='uomType']")
	private WebElement uomtype;
	
	@FindBy(xpath = "//option[@value='PACKING']")
	private WebElement packing;
	
	@FindBy(xpath = "//input[@type='text']")
	private WebElement uomodel;
	
	@FindBy(xpath = "//textarea[@id='description']")
	private WebElement description;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submit;
	
	
	
	
	public UOM_register_Pom(WebDriver driver) {
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
	public void uom() {
		uom.click();
	}
	public void regester() {
		register.click();
	}
	public void uomtype() {
		uomtype.click();
	}
	public void packing() {
		packing.click();
	}
	public void uomodel() {
		uomodel.sendKeys("BOXB");
	}
	public void description() {
		description.sendKeys("This Is Packing Product");
	}
	public void submit() {
		submit.click();
	}
}

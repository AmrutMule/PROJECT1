package project_pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipment_reg_pom {

	@FindBy(xpath = "(//a[@role='button'])[2]")
	WebElement shipment;
	
	@FindBy(xpath = "(//a[text()='REGISTER'])[2]")
	WebElement register;
	
	@FindBy(xpath = "//select[@name='shipmentMode']")
	WebElement shipmode;
	
	@FindBy(xpath = "//select[@name='shipmentMode']//option[3]")
	WebElement air;
	
	@FindBy(xpath = "//input[@type='text']")
	WebElement shipcode;
	
	@FindBy(xpath = "(//input[@type='radio'])[1]")
	WebElement enableship;
	
	@FindBy(xpath = "(//input[@type='radio'])[3]")
	WebElement shipgrade;
	
	@FindBy(xpath = "//div[@class='col-4']//textarea")
	WebElement description;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement submit;
	
	public Shipment_reg_pom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void shipment() {
		shipment.click();
	}
	public void register() {
		register.click();
	}
	public void shipmode() {
		shipmode.click();
	}
	public void air() {
		air.click();
	}
	public void shipcode() {
		shipcode.sendKeys("1234");
	}
	public void enableship() {
		enableship.click();
	}
	public void shipgrade() {
		shipgrade.click();
	}
	public void description() {
		description.sendKeys("This is Shipment");
	}
	public void submit() {
		submit.click();
	}
}

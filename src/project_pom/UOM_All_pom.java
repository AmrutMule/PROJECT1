package project_pom;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UOM_All_pom {
	
	@FindBy(xpath = "(//a[@role='button'])[1]")
	private WebElement uom;

	@FindBy(xpath = "(//a[text()='ALL'])[1]")
			private WebElement all;
	
	@FindBy(xpath = "(//a[@class='btn btn-outline-danger'])[1]")
	private WebElement delete;
	
	@FindBy(xpath = "(//a[@class='btn btn-outline-info'])[1]")
	private WebElement edit;
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement uomtype;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submit;
	
	public UOM_All_pom(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void log() {
		utill.Utility.login();
	}
	public void uom() {
		uom.click();
	}
	public void all() {
		all.click();
	}
	public void delete() {
		delete.click();
	}
	public void edit() {
		edit.click();
	}
	public void uomtype() throws AWTException, InterruptedException {
		uomtype.click();
		Robot ro = new Robot();
		ro.keyPress(KeyEvent.VK_BACK_SPACE);
		ro.keyPress(KeyEvent.VK_BACK_SPACE);
		Thread.sleep(2000);
		ro.keyPress(KeyEvent.VK_BACK_SPACE);
		ro.keyPress(KeyEvent.VK_BACK_SPACE);
		uomtype.sendKeys("SMALL");
	}
	public void submit() {
		submit.click();
	}
}


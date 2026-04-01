package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.CommonUtils;
import Utils.ConfigReader;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	ConfigReader config = new ConfigReader();
	
	@FindBy(xpath="//div[text()='Login']")
	WebElement saveButton;
	
	CommonUtils commonUtils = new CommonUtils(driver);
	public void launchApplication() {
		driver.get(config.get("url"));
		WebElement username=driver.findElement(By.name("email"));
		username.sendKeys(config.get("username"));
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys(config.get("password"));
		//WebElement saveButton=driver.findElement(By.xpath("//div[text()='Login']"));
		saveButton.click();
	}

}

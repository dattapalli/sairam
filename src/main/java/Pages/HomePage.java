package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));

	@FindBy(xpath="//b[text()='Qualizeal']")
	WebElement homePageHeader;
	
	public boolean verifyHomePageIsDisplayed() {
		wait.until(ExpectedConditions.visibilityOf(homePageHeader));
		return homePageHeader.isDisplayed();
		
	}
}

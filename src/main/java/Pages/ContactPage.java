package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.CommonUtils;
import Utils.ExcelReader;

public class ContactPage {
	WebDriver driver;
	public ContactPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//span[text()='Contacts']")
	WebElement contactlink;
	@FindBy(xpath="//button[text()='Create']")
	WebElement createButton;
	@FindBy(name="first_name")
	WebElement fname;
	@FindBy(name="last_name")
	WebElement lname;
	
	CommonUtils utils = new CommonUtils(driver);
	ExcelReader excel = new ExcelReader();
	String filepath ="C:/Users/Harika/eclipse-workspace-1/CogmentoBDD/src/test/resources/TestData.xlsx";
	public void navigateToContactPage() {
		utils.mouseOver(driver, contactlink);
		contactlink.click();
	}
	public void clickOnCreateButton() {
		utils.waitForElement(driver, createButton);
		createButton.click();
	}
	public void enterContactDetails() {
		String firstname = ExcelReader.getCellData(filepath,"contacts",1,1);
		String lastname = ExcelReader.getCellData(filepath,"contacts",1,2);
		fname.sendKeys(firstname);
		lname.sendKeys(lastname);
		
	}

}

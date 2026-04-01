package Hooks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import Utils.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	public static WebDriver driver=new ChromeDriver();
	ConfigReader config = new ConfigReader();
	

	
	
	@Before
	public void setup() {
		driver.manage().window().maximize();
		
		
	}
	
	@After
	public void teardown() {
		driver.quit();
	}
	

}

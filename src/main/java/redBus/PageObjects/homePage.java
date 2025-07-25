package redBus.PageObjects;

import org.openqa.selenium.By;
import redBus.abstractComponents.abstractComponents;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

public class homePage extends abstractComponents{
	
	WebDriver driver;
	
	public homePage(WebDriver driver) {
		
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//div[text()='From']")
	WebElement fromLocationClick;
	
	@FindBy(xpath="//input[@id='srcDest']")
	WebElement fromLocationTextbox;
	
	@FindBy(xpath="//div[text()='Koyambedu, Chennai']")
	WebElement fromBoardingPointClick;
	
	@FindBy(xpath="//div[text()='Bangalore']")
	WebElement toBoardingPointClick;
	
	@FindBy(xpath="//span[text()='Date of Journey']")
	WebElement dateSelectionClick;
	
	@FindBy(xpath="//span[text()='31']")
	WebElement dateClick;
	
	@FindBy(xpath="//button[text()='Search buses']")
	WebElement searchBusesButton;
	
	public void busSearchAction(String sourceLocation) {
		
		fromLocationClick.click();
		
		fromLocationTextbox.sendKeys(sourceLocation);
		
		fromBoardingPointClick.click();
		
		toBoardingPointClick.click();
		
		dateSelectionClick.click();
		
		dateClick.click();
		
		searchBusesButton.click();
		
	}
	

}

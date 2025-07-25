package redBus.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import redBus.abstractComponents.abstractComponents;

public class busAndPassengerDetailsPage extends abstractComponents{
	
	WebDriver driver;
	
	public busAndPassengerDetailsPage(WebDriver driver) {
		
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//div[@data-autoid='bottom-sheet'] //button[contains(@class,'actionButton___')]")
	WebElement popUpCloseButton;
	
	@FindBy(xpath="//span[@id='13U']")
	WebElement seatNumber;
	
	@FindBy(xpath="//button[text()='Select boarding & dropping points']")
	WebElement selectBoardingDroppingPointButton;
	
	@FindBy(xpath="//div[text()='Koyambedu']")
	WebElement startingPoint;
	
	@FindBy(xpath="(//div[text()='Attibele'])[2]")
	WebElement droppingPoint;
	
	@FindBy(xpath="//input[@name='Phone']")
	WebElement enterPhoneNumber;
	
	@FindBy(xpath="//input[@placeholder='Enter email id']")
	WebElement enterEmail;
	
	@FindBy(xpath="//label[text()='State of Residence']/following-sibling::input")
	WebElement stateClick;
	
	@FindBy(xpath="//div[text()='Tamil Nadu']")
	WebElement stateSelection;
	
	@FindBy(xpath="//input[@placeholder='Enter your Name']")
	WebElement enterName;
	
	@FindBy(xpath="//input[@placeholder='Enter Age']")
	WebElement enterAge;
	
	@FindBy(xpath="//label[text()='Male']")
	WebElement selectGender;
	
	@FindBy(xpath="//div[text()='No, I would like to proceed without insurance']")
	WebElement insuranceOptionClick;
	
	@FindBy(xpath="//button[text()='Continue booking']")
	WebElement ContinueBooking;
	
	public void closingWindow() throws InterruptedException {
		
		Thread.sleep(2500);
		popUpCloseButton.click();
		
	}
	
	public void selectingBusDetails() {
		
		seatNumber.click();
		
		selectBoardingDroppingPointButton.click();
		
		startingPoint.click();
		
		droppingPoint.click();
		
	}
	
	public void selectingPassengerDetails(String phoneNum, String email, String name, String age) {
		
		enterPhoneNumber.sendKeys(phoneNum);
		
		enterEmail.sendKeys(email);
		
		stateClick.click();
		
		stateSelection.click();
		
		enterName.sendKeys(name);
		
		enterAge.sendKeys(age);
		
		selectGender.click();
		
		insuranceOptionClick.click();	
		
		ContinueBooking.click();
		
	}


}

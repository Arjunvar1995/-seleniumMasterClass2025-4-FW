package redBus.Tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import redBus.PageObjects.homePage;
import redBus.PageObjects.busSearchResultsPage;
import redBus.PageObjects.busAndPassengerDetailsPage;
import redBus.components.*;
import org.testng.annotations.Test;

public class EndtoEndFlow {
	
	@Test
	public static void busTicketBookingTC() throws InterruptedException, IOException {
		
		baseTest baseTestObject=new baseTest();
		
		WebDriver driver=baseTestObject.launchApplication("https://www.redbus.in/");
		
		homePage homePageObject=new homePage(driver);
		
		homePageObject.busSearchAction("Chennai");
		
		busSearchResultsPage busSearchResultsPageObject=new busSearchResultsPage(driver);
		
		busSearchResultsPageObject.sortByDeparture();
		
		busSearchResultsPageObject.scrollingAndFindingTheBus("NueGo",0, 250);
		
		busAndPassengerDetailsPage busAndPassengerDetailsPageObject=new busAndPassengerDetailsPage(driver);
		
		busAndPassengerDetailsPageObject.closingWindow();
		
		busAndPassengerDetailsPageObject.selectingBusDetails();
		
		busAndPassengerDetailsPageObject.selectingPassengerDetails("9562325487", "arjun@gmail.com", "Arjun", "29");
	}

}

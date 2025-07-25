package redBus.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import redBus.abstractComponents.abstractComponents;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

public class busSearchResultsPage extends abstractComponents{
	
	WebDriver driver;
	
	public busSearchResultsPage(WebDriver driver) {
		
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//div[text()='Departure time']")
	WebElement departureButton;

	@FindBy(xpath="//div[contains(@class,'travelsName___')]")
	List<WebElement> busListsPF;
	
	public void sortByDeparture() {
		
		departureButton.click();
		
	}
	
	public void scrollingAndFindingTheBus(String busName, int x, int y) {
		
		int i=0;
		
		Outer:
		while(i<1000) {
		
		javaScriptExecutor("window.scrollBy("+x+","+y+")");
				
		List<WebElement> busLists=busListsPF;
		
		int index=1;
		
		Inner:
		for(WebElement busList:busLists) {
			
			if(busList.getText().equalsIgnoreCase(busName)) {
				
				System.out.println("Found "+busName);
				
				jsScrollingToView("arguments[0].scrollIntoView(false)",busList);
				
				driver.findElement(By.xpath("(//button[contains(@class,'viewSeatsBtn___')])["+index+"]")).click();
				break Outer;
			}
			
			index++;
			
		}
		
		i++;
		
		}
		
	}

	
}

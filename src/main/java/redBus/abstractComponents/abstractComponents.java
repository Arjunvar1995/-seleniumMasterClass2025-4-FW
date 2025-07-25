package redBus.abstractComponents;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class abstractComponents {
	
	WebDriver driver;
	
	public abstractComponents(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	
	 public void javaScriptExecutor(String jsCommand) {
		 
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript(jsCommand);
		 
	 }
	 
	 public void jsScrollingToView(String JSCommand, WebElement WE) {
		 
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript(JSCommand, WE);
		 
	 }

}

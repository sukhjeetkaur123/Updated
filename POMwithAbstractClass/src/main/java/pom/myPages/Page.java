package pom.myPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Page {
	WebDriver driver;
	WebDriverWait wait;
	 
	
	    @SuppressWarnings("deprecation")
		public Page(WebDriver driver) {
	    	this.driver = driver;
	    	this.wait = new WebDriverWait(this.driver, 15);
	    }
	   
//	     abstract method
	    public abstract String getPageTitle();
	    
//	    public abstract String getPageHeader(By locator);
	    
	    public abstract WebElement getElement(By locator);
	    
	    public abstract void waitForElementPresent(By locator);
	    
	    public abstract void waitPageTitle(String title);
	    
	    public <Tpage extends BasePage> Tpage getInstance(Class<Tpage> pageClass) {
	    	try {
	    		return pageClass.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);
	    		
	    	}
	    	catch (Exception e) {
				// TODO: handle exception
	    		e.printStackTrace();
	    		return null;
			}
			
			
	    }
	    

}

package topicOfSeleniumWithOutTestNG;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {
	public static void main(String[] args) {
		  WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
		    driver.get("http://demo.guru99.com/popup.php");			
	        driver.manage().window().maximize();
	          driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
	        //a[@href="../articles_popup.php"]
	          String mainWindow = driver.getWindowHandle();
	          Set<String> a = driver.getWindowHandles();
	          Iterator<String> i1 = a.iterator();
	          while(i1.hasNext()) {
	        	  String childWind = i1.next();
	        	  if(!mainWindow.equalsIgnoreCase(childWind)) {
	        		  driver.switchTo().window(childWind);
	        		  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abc@gmail.com");
	        		  driver.findElement(By.xpath("//input[@type='submit']")).click();
	        		  driver.close();
	        	  }
	          }
	          driver.switchTo().window(mainWindow);
	}

}

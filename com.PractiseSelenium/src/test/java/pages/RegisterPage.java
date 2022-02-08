package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import driver.Launch_Browser;



public class RegisterPage extends Launch_Browser {
	@Test
	 void addUser() throws InterruptedException {
		 
	        String User = "user"+ (int)(Math.random()*110000);
//	        System.out.println(User);
	        driver1.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
	        driver1.findElement(By.xpath("//input[@id='btnAdd']")).click();
	        driver1.findElement(By.id("systemUser_employeeName_empName")).sendKeys("Aaliyah Haq");
	        driver1.findElement(By.id("systemUser_userName")).sendKeys(User);
	        driver1.findElement(By.id("systemUser_password")).sendKeys("Wel@123come");
	        driver1.findElement(By.id("systemUser_confirmPassword")).sendKeys("Wel@123come");
	        Thread.sleep(2000);
	        WebElement element = driver1.findElement(By.xpath("//input[@class='addbutton']"));
	        JavascriptExecutor executor = (JavascriptExecutor)driver1;
	        executor.executeScript("arguments[0].click();", element);
	        String txt = driver1.findElement(By.id("successBodyEdit")).getText();
//	        Assert.assertEquals(txt,"");
	        System.out.println(txt);
	        System.out.println("User Created successfully......");
//	        driver.findElement(By.xpath("//input[@class='addbutton']")).click();
	    }

}

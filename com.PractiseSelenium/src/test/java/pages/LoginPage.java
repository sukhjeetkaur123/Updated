package pages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;



public class LoginPage extends driver.Launch_Browser{
	@Test
	public void Login()
	{
		driver1.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver1.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver1.findElement(By.id("btnLogin")).click();
	}
		@Test
		public void forgetpass()
		{
			driver1.findElement(By.linkText("Forgot your password?")).click();
			driver1.navigate().back();
		}
}

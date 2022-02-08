package pages;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;



public class HomePage extends driver.Launch_Browser{
	String actualTitle;
	@Test
	public void VerifyPage()
	{
		actualTitle=driver1.getTitle();
		Assert.assertEquals(actualTitle, "OrangeHRM");
	}
	@Test
	public void Logout()
	{
		driver1.findElement(By.partialLinkText("Welcome")).click();
		driver1.findElement(By.linkText("Logout")).click();
	}

}

package com.testBase;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.POM.PageFactory.ObjectFactory;
import com.POM.pages.LoginPage;

import com.POM.tests.LoginTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static Properties prop;
	public static WebDriver driver;
    protected static ObjectFactory obj;
	
	public TestBase() {
		try {
		
			FileInputStream fis = new FileInputStream("C:\\Users\\SukhjeetKaur\\eclipse-workspace\\com.POM.withpageFactory\\src\\test\\java\\com\\POM\\configation\\config.properties");
			prop= new Properties();
			prop.load(fis);
	}
		
		
    catch(Exception e) {
    	e.printStackTrace();
    }
}
	public void intialization() {
		obj = new ObjectFactory();
		  WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
	   
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		  driver.get(prop.getProperty("url"));
		  
		
	}
}

package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Main {
	public static void main(String args[]) {
		
//		System.out.println("Hello");
		System.setProperty("driver.chrome.driver", "C:\\Users\\SukhjeetKaur\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://google.com");
		driver.close();
	}

}

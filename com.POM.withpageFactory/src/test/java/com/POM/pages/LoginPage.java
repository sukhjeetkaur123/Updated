package com.POM.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testBase.TestBase;

public class LoginPage extends TestBase{
	
//	WebDriver driver;
//	 page factory class
	@FindBy(id = "txtUsername")
	WebElement userName1;
	
	@FindBy(id="txtPassword")
	WebElement password1;
	
	@FindBy(id = "btnLogin")
	WebElement loginButton;
	
	@FindBy(linkText ="Forgot your password?")
	WebElement forgetPass;
	
	public LoginPage() {
				
		PageFactory .initElements(driver, this);
		
	}
	
	public String verifyTitle() {
		return driver.getTitle();
	}
	
	public void login() throws IOException{
		String path =System.getProperty("user.dir")+"//TestData/ready.xlsx";
			FileInputStream f1 = new FileInputStream(path);
			XSSFWorkbook wr = new XSSFWorkbook(f1);
			XSSFSheet sh = wr.getSheetAt(0);
			
			if (sh == null) throw new IllegalArgumentException("Sheet with sheet name " + sh + " does not exist");
			System.out.println(" the sheet last row number is:"+sh.getLastRowNum());
			
			for(int i =1;i<=sh.getLastRowNum();i++) {
				String userName=sh.getRow(i).getCell(0).getStringCellValue();
				userName1.sendKeys(userName);
				String pass=sh.getRow(i).getCell(1).getStringCellValue();
				
			password1.sendKeys(pass);
//				sh.getRow(i).createCell(3).setCellValue("pass");
//				FileOutputStream outFile =new FileOutputStream(path);
//				wr.write(outFile);
//		userName1.sendKeys(prop.getProperty("username"));
//		password1.sendKeys(prop.getProperty("pass"));
		loginButton.click();
	}}
	
			
	
	
	public void forgetPassword() {
		forgetPass.click();
		driver.navigate().back();
	}

}

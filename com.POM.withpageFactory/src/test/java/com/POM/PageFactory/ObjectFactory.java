package com.POM.PageFactory;

import com.POM.pages.HomePage;
import com.POM.pages.LoginPage;

public class ObjectFactory {
	private LoginPage loginp;
	private HomePage homep;
	
	
	public LoginPage getLoginData() {
		if(loginp==null) {
			loginp = new LoginPage();
		}
		return loginp;
	}
	
	public HomePage getHomeData() {
		if(homep==null) {
			homep = new HomePage();
		}
		return homep;
	}

}

package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinHotel extends Baseclass {

	public AdactinHotel() {
	PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement txtUsername;
	@FindBy(id="password")
	private WebElement txtpass;	
	@FindBy(id="login")
	private WebElement btnlogin;
	public WebElement getTxtUsername() {
		return txtUsername;
	}
	public WebElement getTxtpass() {
		return txtpass;
	}
	public WebElement getBtnlogin() {
		return btnlogin;
	} 
			
		

}


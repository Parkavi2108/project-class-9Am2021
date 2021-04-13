package org.blazetask;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.pom.Baseclass;

public class PassengerDetails extends Baseclass {
	public PassengerDetails() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="inputName")
	public WebElement firstname;

	@FindBy(id="address")
	public WebElement add;
	
	@FindBy(id="city")
	public WebElement cityname;
	
	@FindBy(id="state")
	public WebElement stat;
	
	@FindBy(id="zipCode")
	public WebElement zip;
	
	@FindBy(id="cardType")
	public WebElement type;
	
	@FindBy(id="creditCardMonth")
	public WebElement ccmonth;
	
	@FindBy(id="creditCardNumber")
	public WebElement creditcard;
	
	@FindBy(id="creditCardYear")
	public WebElement ccyr;
	
	@FindBy(id="nameOnCard")
	public WebElement nocard;
	
	@FindBy(id="rememberMe")
	public WebElement btn;
	
	@FindBy(xpath="//input[@value='Purchase Flight']")
	public WebElement purchase;


	

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getCityname() {
		return cityname;
	}

	public WebElement getStat() {
		return stat;
	}

	public WebElement getZip() {
		return zip;
	}

	public WebElement getType() {
		return type;
	}

	public WebElement getCcmonth() {
		return ccmonth;
	}
	
	public WebElement getCreditcard() {
		return creditcard;
	}

	public WebElement getCcyr() {
		return ccyr;
	}

	public WebElement getNocard() {
		return nocard;
	}

	public WebElement getBtn() {
		return btn;
	}

	public WebElement getPurchase() {
		return purchase;
	}
	
	
	
	
}

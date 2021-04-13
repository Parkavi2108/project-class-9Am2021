package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookingconfirm extends Baseclass {

	public Bookingconfirm() {
		PageFactory.initElements(driver, this);
		}
	@FindBy(id="order_no")
	private WebElement orderNo;
	
	public WebElement getOrderNo() {
		return orderNo;
	}
	@FindBy(xpath=("//input[@id='my_itinerary']"))
	private WebElement itinerary;
	
	public WebElement getItinerary() {
		return itinerary;
	}

	}
	

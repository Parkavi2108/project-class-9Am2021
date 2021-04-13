package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends Baseclass {

	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private WebElement selectLocation;

	@FindBy(id = "hotels")
	private WebElement selectHotel;

	@FindBy(id = "room_type")
	private WebElement selectRoom;

	@FindBy(id = "room_nos")
	private WebElement selectNumber;

	@FindBy(id = "datepick_in")
	private WebElement selectDatein;

	@FindBy(id = "datepick_out")
	private WebElement selectDateout;

	@FindBy(id = "adult_room")
	private WebElement adultRoom;

	@FindBy(id = "child_room")
	private WebElement selectChild;

	@FindBy(id = "Submit")
	private WebElement selectSubmit;
	
	public WebElement getSelectLocation() {
		return selectLocation;
	}

	public WebElement getSelectHotel() {
		return selectHotel;
	}

	public WebElement getSelectRoom() {
		return selectRoom;
	}

	public WebElement getSelectNumber() {
		return selectNumber;
	}

	public WebElement getSelectDatein() {
		return selectDatein;
	}

	public WebElement getSelectDateout() {
		return selectDateout;
	}

	public WebElement getAdultRoom() {
		return adultRoom;
	}

	public WebElement getSelectChild() {
		return selectChild;
		
	}
		
		public WebElement getSelectSubmit() {
			return selectSubmit;
	}

}

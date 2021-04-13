package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinalHotelBooking extends Baseclass {
		
		public FinalHotelBooking() {
			
			PageFactory.initElements(driver, this);	
		}
		
		@FindBy(id="first_name")
		private WebElement fNme;
		
		@FindBy(id="last_name")
		private WebElement lNme;
		
		@FindBy(id="address")
		private WebElement buildAdd;
		
		@FindBy(id="cc_num")
		private WebElement creditNum;
		
		@FindBy(id="cc_type")
		private WebElement ccType;
		
		public WebElement getCcType() {
			return ccType;
		}

		public WebElement getCcMonth() {
			return ccMonth;
		}

		public WebElement getCcYear() {
			return ccYear;
		}

		@FindBy(id="cc_exp_month")
		private WebElement ccMonth;

		@FindBy(id="cc_exp_year")
		private WebElement ccYear;

		@FindBy(id="cc_cvv")
		private WebElement ccvvtNum;
		
		@FindBy(id="book_now")
		private WebElement bookkNw;
		
		
		
		
		

		public WebElement getfNme() {
			return fNme;
		}

		public WebElement getlNme() {
			return lNme;
		}

		public WebElement getBuildAdd() {
			return buildAdd;
		}

		public WebElement getCreditNum() {
			return creditNum;
		}

		public WebElement getCcvvtNum() {
			return ccvvtNum;
		}

		public WebElement getBookkNw() {
			return bookkNw;
		}

				
		
		}
	




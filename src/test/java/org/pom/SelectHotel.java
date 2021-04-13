package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends Baseclass {
	
	public  SelectHotel () {
	
				PageFactory.initElements(driver, this);
		}
			
		@FindBy(id="radiobutton_0")
		public WebElement btnRadio;
		
		@FindBy(id="continue")
		public WebElement btnCont;

		public WebElement getBtnRadio() {
			return btnRadio;
		}

		public WebElement getBtnCont() {
			return btnCont;
		}
		
	}


	
	


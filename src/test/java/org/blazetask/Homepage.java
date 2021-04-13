package org.blazetask;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.pom.Baseclass;

public class Homepage extends Baseclass {
	public Homepage() {
	PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath="//select[@name='fromPort']")
	private WebElement inline;
	
	@FindBy(xpath="//select[@name='toPort']")
	private WebElement toport;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement sub;

	
	
	public WebElement getInline() {
		return inline;
	}

	public WebElement getToport() {
		return toport;
	}

	
	public WebElement getSub() {
		return sub;
	}
	

	
}

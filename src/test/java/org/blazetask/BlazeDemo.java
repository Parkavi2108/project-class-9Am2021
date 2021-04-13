package org.blazetask;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pom.Baseclass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BlazeDemo extends Baseclass {
	ExtentReports reports;
	ExtentHtmlReporter htmlReporter;	
	ExtentTest extentTest;

	@BeforeClass
	private void beforeclassmethod() 
	{
	reports=new ExtentReports();
	htmlReporter=new ExtentHtmlReporter("extentreport.html");
	reports.attachReporter(htmlReporter);
	configBrowser();
	launchUrl("https://blazedemo.com/");

	}
	@AfterClass
	private void afterClass()
	{
		//driver.close();
		reports.flush();

	}
@Test(priority = 1)
private void tc0() {
	extentTest = reports.createTest("Login blazedemo Application");
	extentTest.log(Status.INFO, "Login blazedemo application by invalid username");
	if (driver.getCurrentUrl().contains("blazedemo"))
	{
		extentTest.log(Status.PASS, "url is valid");	
		}
     else {
	extentTest.log(Status.FAIL, "Invalid url");	

}
}
@Test(priority = 2)
private void tc1() {
	extentTest=reports.createTest("Booking to the Simple Travel Agency");
	extentTest.log(Status.INFO, "select departure destination");
	Homepage a=new Homepage();
	WebElement inline=a.getInline();
	if (inline.isEnabled()&& inline.isDisplayed()) {
		extentTest.log(Status.PASS, "Departure city is selected");
		selectByIndex(inline,2);
		}
	else {
		extentTest.log(Status.FAIL, "Departure city is unselected");
	}
	WebElement toport=a.getToport();
	if (toport.isEnabled() && toport.isDisplayed()) {
		extentTest.log(Status.PASS, "Destination city is selected");
		selectByIndex(toport, 2);
	}
		else {
			extentTest.log(Status.FAIL, "Departure city is unselected");	
		}		
	WebElement sub=a.getSub();
	if (sub.isEnabled() && sub.isDisplayed()) {
		extentTest.log(Status.PASS, "Submit button is enable");
		click(sub);
	}
	else {
		extentTest.log(Status.FAIL, "submit button is not enable");
	}
}
@Test(priority = 3)
private void tc2() {
extentTest=reports.createTest("Booking to the simple travel agency");
extentTest.log(Status.INFO, "Select departure and destination");
WebElement chooseFlight = driver.findElement(By.xpath("(//input[@value='Choose This Flight'])[3]"));
if (chooseFlight.isEnabled() && chooseFlight.isDisplayed()) {
	extentTest.log(Status.PASS, "Choose flight is enabled");
	click(chooseFlight);
}
	else {
		extentTest.log(Status.FAIL, "Choose flight is disabled");
	}
}
@Parameters({"inputName","address","city","state","zipCode","creditCardNumber","creditCardMonth","creditCardYear","nameOnCard"})
@Test(priority = 4)
private void tc3(String s,String s1,String s2,String s3,String s4,String s5,String s6,String s7,String s8) {
extentTest=reports.createTest("Your flight from selected");
extentTest.log(Status.INFO, "Select departure and destination");
PassengerDetails b=new PassengerDetails();
WebElement firstname=b.getFirstname();
if (firstname.isEnabled() && firstname.isDisplayed()) {
	extentTest.log(Status.PASS, "is enable");
	type(firstname, s);
	}
else {
	extentTest.log(Status.FAIL, "is notenable");
}
WebElement address=b.getAdd();
if (address.isEnabled() && address.isDisplayed()) {
	extentTest.log(Status.PASS, "is enable");
	type(address, s1);
	}
else {
	extentTest.log(Status.FAIL, "is notenable");

}
WebElement city=b.getCityname();
if (city.isEnabled() && city.isDisplayed()) {
	extentTest.log(Status.PASS, "is enable");
	type(city, s2);
	}
else {
	extentTest.log(Status.FAIL, "is notenable");

}
WebElement state=b.getStat();
if (state.isEnabled() && state.isDisplayed()) {
	extentTest.log(Status.PASS, "is enable");
	type(state, s3);
	}
else {
	extentTest.log(Status.FAIL, "is notenable");

}
WebElement zipCode=b.getZip();
if (zipCode.isEnabled() && zipCode.isDisplayed()) {
	extentTest.log(Status.PASS, "is enable");
	type(zipCode, s4);
	}
else {
	extentTest.log(Status.FAIL, "is notenable");

}
WebElement cardType=b.getType();
if (cardType.isEnabled() && cardType.isDisplayed()) {
	extentTest.log(Status.PASS, "is enable");
	selectByIndex(cardType, 2);
	}
else {
	extentTest.log(Status.FAIL, "is notenable");

}
WebElement creditCardNumber=b.getCreditcard();
if (creditCardNumber.isEnabled() && creditCardNumber.isDisplayed()) {
	extentTest.log(Status.PASS, "is enable");
type(creditCardNumber, s5);
	}
else {
	extentTest.log(Status.FAIL, "is notenable");

}

WebElement month=b.getCcmonth();
if (month.isEnabled() && month.isDisplayed()) {
	extentTest.log(Status.PASS, "is enable");
	type(month, s6);
}
else {
	extentTest.log(Status.FAIL, "is notenable");
}
WebElement creditCardYear=b.getCcyr();
if (creditCardYear.isEnabled() && creditCardYear.isDisplayed()) {
	extentTest.log(Status.PASS, "is enable");
	type(creditCardYear, s7);
}
else {
	extentTest.log(Status.FAIL, "is notenable");
}
WebElement nameOnCard=b.getNocard();
if (nameOnCard.isEnabled() && nameOnCard.isDisplayed()) {
	extentTest.log(Status.PASS, "is enable");
	type(nameOnCard, s8);
}
else {
	extentTest.log(Status.FAIL, "is notenable");
}
WebElement click=b.getBtn();
click(click);
if (click.isEnabled() && click.isDisplayed()) {
	extentTest.log(Status.PASS, "is enable");
	
}
else {
	extentTest.log(Status.FAIL, "is notenable");
}
WebElement purchase=b.getPurchase();
click(purchase);
if (purchase.isEnabled() && purchase.isDisplayed()) {
	extentTest.log(Status.PASS, "is enable");
	
}
else {
	extentTest.log(Status.FAIL, "is notenable");
}

}
@Test(priority = 5)
private void tc4() {
extentTest=reports.createTest("Thank you for your purchase today");
extentTest.log(Status.INFO, "print order ID number");
WebElement orderIdNo = driver.findElement(By.xpath("//table[@class='table']//tr[1]//td[2]"));
if (orderIdNo.isDisplayed()) {
	extentTest.log(Status.PASS, "orderIdNo is generated");
	}
else {
	extentTest.log(Status.FAIL, "orderIdNo is not generated");
	}
String text = orderIdNo.getText();
System.out.println("OrderId no: "+text);

}




}



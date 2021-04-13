package org.pom;

import java.awt.dnd.DropTargetDropEvent;
import java.io.IOException;
import java.lang.reflect.Method;

import javax.swing.text.Element;

import org.apache.xmlbeans.impl.store.SaxonXBeansDelegate.QueryInterface;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Loginpage extends Baseclass {
@BeforeClass
private void before() {
configBrowser();
launchUrl("https://adactinhotelapp.com/");
maximize();
}
@AfterClass
private void aftercl() throws Throwable {
	Thread.sleep(5000);

}
@Parameters({"username","password"})
@Test
private void tc0(String s,String s1) 
{
	WebElement txtUsername = driver.findElement(By.id("username"));
	txtUsername.sendKeys(s);
	WebElement txtpass = driver.findElement(By.id("password"));
	txtpass.sendKeys(s1);
	WebElement btnClick = driver.findElement(By.id("login"));
	click(btnClick);

}
@Parameters({"checkin","checkout"})
@Test
private void tc2Register(String d,String d1) {
WebElement location = driver.findElement(By.id("location"));
selectByIndex(location, 2);
WebElement hotels = driver.findElement(By.id("hotels"));
selectByIndex(hotels, 2);
WebElement roomtype=driver.findElement(By.id("room_type"));
selectByIndex(roomtype, 3);
WebElement roomnumbers = driver.findElement(By.id("room_nos"));
selectByIndex(roomnumbers, 2);
WebElement checkin = driver.findElement(By.id("datepick_in"));
checkin.sendKeys(d);
WebElement checkout = driver.findElement(By.id("datepick_out"));
checkout.sendKeys(d1);
WebElement adult = driver.findElement(By.id("adult_room"));
selectByIndex(adult, 2);
WebElement child=driver.findElement(By.id("child_room"));
selectByIndex(child, 1);
WebElement submit = driver.findElement(By.id("Submit"));
submit.click();

}
@Test
private void tc3Register() {
WebElement RadioButton = driver.findElement(By.id("radiobutton_0"));
RadioButton.click();

WebElement contin = driver.findElement(By.id("continue"));
contin.click();
}




@Parameters({"firstName","lastname","address","ccnum","cccvv"})
@Test
private void tc4Register(String n,String n1,String n3,String n4,String n5)
{
WebElement FirstName = driver.findElement(By.id("first_name"));
FirstName.sendKeys(n);
WebElement LastName = driver.findElement(By.id("last_name"));
LastName.sendKeys(n1);
WebElement Add = driver.findElement(By.id("address"));
Add.sendKeys(n3);
WebElement cardnumber = driver.findElement(By.id("cc_num"));
cardnumber.sendKeys(n4);
WebElement cardtype = driver.findElement(By.id("cc_type"));
selectByIndex(cardtype, 2);
WebElement Expmonth = driver.findElement(By.id("cc_exp_month"));
selectByIndex(Expmonth, 2);
WebElement Expyr = driver.findElement(By.id("cc_exp_year"));
selectByIndex(Expyr, 3);
WebElement cvv = driver.findElement(By.id("cc_cvv"));
cvv.sendKeys(n5);
WebElement Book=driver.findElement(By.id("book_now"));
Book.click();
}
@Test
private void tc5Register() throws InterruptedException {
	Thread.sleep(8000);
	
	WebElement iteam = driver.findElement(By.id("my_itinerary"));
	iteam.click();
	Thread.sleep(9000);
	WebElement order=driver.findElement(By.xpath("//input[@id='order_id_409202']"));
	String attribute = order.getAttribute("value");
	System.out.println(attribute);

}

@AfterMethod
private void aftermetho(Method method) throws IOException {
	takeScreenshot(method.getName());

}

}



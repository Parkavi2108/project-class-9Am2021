package org.dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pom.Baseclass;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HardAssert extends Baseclass {
@BeforeClass
private void beforeclas() {
	configBrowser();
	launchUrl("https://www.facebook.com/");
	}
@Test
private void tc0() {
WebElement txtUserName = driver.findElement(By.id("email"));
txtUserName.sendKeys("java");

String attribute = txtUserName.getAttribute("value");
Assert.assertEquals("java", attribute);
}
@Test
private void tc1() {
System.out.println("End");
}
}

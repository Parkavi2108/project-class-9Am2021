package org.dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pom.Baseclass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Sample extends Baseclass{
@Test(dataProvider="Data")
private void tc0(String s,String s1) {
configBrowser();
launchUrl("https://www.redbus.in/");
WebElement txtUserName = driver.findElement(By.id("src"));
txtUserName.sendKeys(s);
WebElement txtUserNames=driver.findElement(By.id("dest"));
txtUserNames.sendKeys(s1);
}
@DataProvider(name="Data")
public Object[][] loginData()
{
	return new Object[][] {{"chennai","chidhambaram"},{"chennai","bangalore"},{"chennai","madurai"}};
}
}
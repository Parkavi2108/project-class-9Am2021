package org.dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pom.Baseclass;
import org.testng.annotations.Test;

public class AutomationRerun extends Baseclass {

	@Test
	private void tc0() {
		configBrowser();
		launchUrl("https://adactinhotelapp.com/");
		maximize();
		WebElement txtUsername = driver.findElement(By.id("username"));
		txtUsername.sendKeys("parkavip");
		WebElement txtpass = driver.findElement(By.id("password"));
		txtpass.sendKeys("O7D6EW");
		WebElement btnClick = driver.findElement(By.id("login"));
		click(btnClick);

	}

	@Test
	private void tc2Register() {
		WebElement location = driver.findElement(By.id("location"));
		selectByIndex(location, 2);
		WebElement hotels = driver.findElement(By.id("hotels"));
		selectByIndex(hotels, 2);
		WebElement roomtype = driver.findElement(By.id("room_type"));
		selectByIndex(roomtype, 3);
		WebElement roomnumbers = driver.findElement(By.id("room_nos"));
		selectByIndex(roomnumbers, 2);
		WebElement checkin = driver.findElement(By.id("datepick_in"));
		checkin.sendKeys("10.4.2021");
		WebElement checkout = driver.findElement(By.id("datepick_out"));
		checkout.sendKeys("11.04.2021");
		WebElement adult = driver.findElement(By.id("adult_room"));
		selectByIndex(adult, 2);
		WebElement child = driver.findElement(By.id("child_room"));
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

	@Test
	private void tc4Register() {
		WebElement FirstName = driver.findElement(By.id("first_name"));
		FirstName.sendKeys("parkavi");
		WebElement LastName = driver.findElement(By.id("last_name"));
		LastName.sendKeys("p");
		WebElement Add = driver.findElement(By.id("address"));
		Add.sendKeys("chennai");
		WebElement cardnumber = driver.findElement(By.id("cc_num"));
		cardnumber.sendKeys("2343454324567890");
		WebElement cardtype = driver.findElement(By.id("cc_type"));
		selectByIndex(cardtype, 2);
		WebElement Expmonth = driver.findElement(By.id("cc_exp_month"));
		selectByIndex(Expmonth, 2);
		WebElement Expyr = driver.findElement(By.id("cc_exp_year"));
		selectByIndex(Expyr, 3);
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys("123");
		WebElement Book = driver.findElement(By.id("book_now"));
		Book.click();
	}

	@Test
	private void tc5Register() throws InterruptedException {

		WebElement iteam = driver.findElement(By.id("my_itinerary"));
		iteam.click();

		WebElement order = driver.findElement(By.xpath("//input[@id='order_id_409202']"));
		String attribute = order.getAttribute("value");
		System.out.println(attribute);

	}

}

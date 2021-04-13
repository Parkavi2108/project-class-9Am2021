package org.ReportLogin;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pom.Baseclass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Htmlreports extends Baseclass {
ExtentReports reports;
ExtentHtmlReporter htmlReporter;
WebDriver driver;
ExtentTest extentTest;

@BeforeClass
public void beforeclassmethod() 
{
reports=new ExtentReports();
htmlReporter=new ExtentHtmlReporter("extentreport.html");
reports.attachReporter(htmlReporter);
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
driver.get("https://adactinhotelapp.com/");
}
@AfterClass
public void AfterClass()
{
	driver.close();
	reports.flush();

}

@Test
public void tc0() 
{
extentTest = reports.createTest("Login Adactin Application");
extentTest.log(Status.INFO, "Login adactin application by invalid username");
extentTest.log(Status.INFO, "verify FB URL");
if (driver.getCurrentUrl().contains("adactin"))
{
extentTest.log(Status.PASS, "url is valid");	
}
else 
{
extentTest.log(Status.FAIL, "Invalid url");	
}
}
@Test
private void tc1() throws IOException 
{
extentTest=reports.createTest("Entering values into adactin");
extentTest.log(Status.INFO, "verifying UserName textbox is enabled");
WebElement txtUserName = driver.findElement(By.id("username"));
if (txtUserName.isEnabled() && txtUserName.isDisplayed()) 
{
extentTest.log(Status.PASS, "userName field is enalbe");
txtUserName.sendKeys("hijavaaa");
File screenshotAs = txtUserName.getScreenshotAs(OutputType.FILE);	
FileUtils.copyFile(screenshotAs, new File("adactin.png"));
extentTest.addScreenCaptureFromPath("adactin.png");
}


extentTest.log(Status.INFO, "verifying UserName textbox is enabled");
WebElement Password = driver.findElement(By.id("password"));
if (Password.isEnabled() && Password.isDisplayed())
{
	extentTest.log(Status.PASS, "password field is enalbe");
	Password.sendKeys("parkavi");
	File screenshotAs = Password.getScreenshotAs(OutputType.FILE);	
	FileUtils.copyFile(screenshotAs, new File("adactins.png"));
	extentTest.addScreenCaptureFromPath("adactins.png");

	
	
}




}



}



